package old_practice.LoggingSystem.logMessage;

import old_practice.LoggingSystem.constants.LogLevel;
import old_practice.LoggingSystem.exceptions.IllegalLogLevelException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class DefaultLogMessageTemplate  implements LogTemplate{

    private String logID;

    public DefaultLogMessageTemplate() {
        logID = UUID.randomUUID().toString();
    }

    public abstract void writeLogMessage(String message, LogLevel logLevel, Class o) throws IllegalLogLevelException;

    protected boolean validateLogLevel(LogLevel logLevel) throws IllegalLogLevelException {
        if (logLevel.equals(LogLevel.ERROR) ||
                logLevel.equals(LogLevel.DEBUG) ||
                logLevel.equals(LogLevel.INFO) ||
                logLevel.equals(LogLevel.WARN)) return true;
        throw new IllegalLogLevelException();
    }

    protected String getMessageAsTemplate(String message, LogLevel logLevel, Class o) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String logMessage = timestamp+ " :: "+ logLevel + "  : from " + o.getSimpleName() + " " + message;
        return logMessage;

    }
}
