package old_practice.LoggingSystem.logDestinations;

import old_practice.LoggingSystem.constants.LogLevel;
import old_practice.LoggingSystem.exceptions.IllegalLogLevelException;
import old_practice.LoggingSystem.logMessage.DefaultLogMessageTemplate;

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
