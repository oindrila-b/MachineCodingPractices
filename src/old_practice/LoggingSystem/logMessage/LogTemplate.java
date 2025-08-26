package old_practice.LoggingSystem.logMessage;

import old_practice.LoggingSystem.constants.LogLevel;
import old_practice.LoggingSystem.exceptions.IllegalLogLevelException;

public interface LogTemplate {
    void writeLogMessage(String message, LogLevel logLevel, Class o)throws IllegalLogLevelException;
}
