package old_practice.ParkingLot.slotManager;

import old_practice.ParkingLot.constants.VehicleType;
import old_practice.ParkingLot.exceptions.InvalidVehicleIDException;
import old_practice.ParkingLot.exceptions.MissingTicketPropertyException;
import old_practice.ParkingLot.exceptions.TicketCreationException;
import old_practice.ParkingLot.model.slot.Slot;
import old_practice.ParkingLot.model.slot.implementations.BikeSlot;
import old_practice.ParkingLot.model.slot.implementations.CarSlot;
import old_practice.ParkingLot.model.slot.implementations.TruckSlot;
import old_practice.ParkingLot.model.ticketModel.Ticket;
import old_practice.ParkingLot.model.vehicle.Vehicle;
import old_practice.ParkingLot.ticketManager.DefaultTicketManager;
import old_practice.ParkingLot.ticketManager.TicketManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class DefaultSlotManager implements SlotManager{

    private List<Slot> vehicleSlot;
    private final int TRUCK_SLOT = 1;
    private final int BIKE_SLOT = 2;
    private Map<String, String> slotLicenseMap;
    private Map<String,Vehicle> licenseVehicleMap;
    private TicketManager ticketManager;

    public DefaultSlotManager() {
        vehicleSlot = new ArrayList<>();
        slotLicenseMap = new HashMap<>();
        licenseVehicleMap = new HashMap<>();
        ticketManager = new DefaultTicketManager();
    }

    @Override
    public List<Slot> getPopulatedSlot(int floorNumber, int numberOfSlots) {
        int n = 0;
        int bike_slot = 0;
        int truck_slot = 0;
        while (n++ < numberOfSlots) {
            String slotID = String.valueOf(floorNumber+n);
            if (truck_slot++ < TRUCK_SLOT) {
                vehicleSlot.add(new TruckSlot(slotID));
            } else if (bike_slot++ < BIKE_SLOT) {
                vehicleSlot.add(new BikeSlot(slotID));
            }else{
                vehicleSlot.add(new CarSlot(slotID));
            }
        }
        return vehicleSlot;
    }

    @Override
    public Ticket parkVehicle(VehicleType vehicleType, List<Slot> slots, Vehicle vehicle, String floorID) throws TicketCreationException, MissingTicketPropertyException {
        AtomicBoolean isParked = new AtomicBoolean(false);
        AtomicReference<String> slotID = new AtomicReference<>("");
        slots.forEach(slot -> {
            switch (vehicleType){
                case CAR -> {
                    if (slot instanceof CarSlot){
                        slotID.set(setParking(vehicle, slot, isParked));
                    }
                }
                case BIKE -> {
                    if (slot instanceof BikeSlot){
                        slotID.set(setParking(vehicle, slot, isParked));
                    }
                }
                case TRUCK -> {
                    if (slot instanceof TruckSlot){
                        slotID.set(setParking(vehicle, slot, isParked));
                    }
                }
            }
        });

       if (isParked.get() && slotID.get()!= null) {
           return createTicket(slotID.get(),floorID,vehicleType,vehicle.getLicenseNumber());
       }else{
         throw new TicketCreationException();
       }
    }

    @Override
    public boolean unParkVehicle(String vehicleID) throws InvalidVehicleIDException {
        AtomicBoolean isUnParked = new AtomicBoolean(false);
        String slotID = slotLicenseMap.get(vehicleID);
        if (slotID == null || slotID.isEmpty()) throw new InvalidVehicleIDException();
        vehicleSlot.forEach(slot -> {
            if (slot.getSlotID().equals(slotID)){
                setUnParking(slot, isUnParked);
            }
        });
        return isUnParked.get();
    }

    private String setParking(Vehicle vehicle, Slot slot, AtomicBoolean isParked){
        if (!slot.isBooked()) {
           try {
               slot.setVehicleLicenseNumber(vehicle.getLicenseNumber());
               slot.setBooked(true);
               slotLicenseMap.put(vehicle.getLicenseNumber(), slot.getSlotID());
               licenseVehicleMap.put(vehicle.getLicenseNumber(), vehicle);
               isParked.set(true);
           }catch (Exception e) {
               throw e;
           }
           return slot.getSlotID();
        }
        return null;
    }

    private void setUnParking(Slot slot, AtomicBoolean isUnParked){
        if (slot.isBooked()) {
            slot.setBooked(false);
            slot.setVehicleLicenseNumber(null);
            isUnParked.set(true);
        }
    }

    private Ticket createTicket(String slotID, String floorID,VehicleType vehicleType, String vehicleNumber) throws MissingTicketPropertyException {
        return ticketManager.createTicket(slotID,floorID,vehicleType,vehicleNumber );
    }
}
