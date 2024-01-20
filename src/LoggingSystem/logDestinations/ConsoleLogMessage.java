package LoggingSystem.logDestinations;

import LoggingSystem.constants.LogLevel;
import LoggingSystem.exceptions.IllegalLogLevelException;
import LoggingSystem.logMessage.DefaultLogMessageTemplate;

public class ConsoleLogMessage extends DefaultLogMessageTemplate {
    @Override
    public void writeLogMessage(String message, LogLevel logLevel, Class o) throws IllegalLogLevelException {
       if (validateLogLevel(logLevel)) {
           System.out.println(getMessageAsTemplate(message,logLevel,o));
       }
    }
}
