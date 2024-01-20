package LoggingSystem.logMessage;

import LoggingSystem.constants.LogLevel;
import LoggingSystem.exceptions.IllegalLogLevelException;

public interface LogTemplate {
    void writeLogMessage(String message, LogLevel logLevel, Class o)throws IllegalLogLevelException;
}
