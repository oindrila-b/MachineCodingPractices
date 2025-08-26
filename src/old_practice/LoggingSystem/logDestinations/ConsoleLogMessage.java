package old_practice.LoggingSystem.logDestinations;

import old_practice.LoggingSystem.constants.LogLevel;
import old_practice.LoggingSystem.exceptions.IllegalLogLevelException;
import old_practice.LoggingSystem.logMessage.DefaultLogMessageTemplate;

public class ConsoleLogMessage extends DefaultLogMessageTemplate {
    @Override
    public void writeLogMessage(String message, LogLevel logLevel, Class o) throws IllegalLogLevelException {
       if (validateLogLevel(logLevel)) {
           System.out.println(getMessageAsTemplate(message,logLevel,o));
       }
    }
}
