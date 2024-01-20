package LoggingSystem.logDestinations;

import LoggingSystem.constants.LogLevel;
import LoggingSystem.exceptions.IllegalLogLevelException;
import LoggingSystem.logMessage.DefaultLogMessageTemplate;

import java.io.FileWriter;

public class FileLogMessage extends DefaultLogMessageTemplate {

    private String filename;

    public FileLogMessage(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeLogMessage(String message, LogLevel logLevel, Class o) throws IllegalLogLevelException {
        if (validateLogLevel(logLevel)) {
            try{
                FileWriter fileWriter = new FileWriter(filename, true);
                String logMessage = getMessageAsTemplate(message,logLevel,o);
                fileWriter.write(logMessage );
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
