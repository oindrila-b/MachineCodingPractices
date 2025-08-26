package old_practice.LoggingSystem.driver;

import old_practice.LoggingSystem.constants.LogLevel;
import old_practice.LoggingSystem.logDestinations.ConsoleLogMessage;
import old_practice.LoggingSystem.logMessage.LogTemplate;

public class DriverClass {
    public static void main(String[] args) {
        LogTemplate logTemplate = new ConsoleLogMessage();
        try{
            logTemplate.writeLogMessage("This is a test console message", LogLevel.INFO, DriverClass.class);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
