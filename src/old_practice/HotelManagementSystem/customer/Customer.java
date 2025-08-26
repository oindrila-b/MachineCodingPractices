package old_practice.HotelManagementSystem.customer;

public class Customer {

    private String customerID;
    private String customerName;
    private String phoneNumber;

    public Customer(String customerID, String customerName, String phoneNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
