package LoggingSystem.driver;

import LoggingSystem.constants.LogLevel;
import LoggingSystem.logDestinations.ConsoleLogMessage;
import LoggingSystem.logMessage.LogTemplate;

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
