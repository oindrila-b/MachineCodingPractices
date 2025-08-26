package old_practice.LoggingSystem.exceptions;

public class IllegalLogLevelException extends Exception{
    public IllegalLogLevelException() {
        super("Illegal Log Level type provided!");
    }
}
