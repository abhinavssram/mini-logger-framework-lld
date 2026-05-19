package main.java;

public class LogFormatter {
    public String format(LogMessage logMessage) {
        return "[" + logMessage.getTimeStamp() + "] [" + logMessage.getLogTypes() + "] " + logMessage.getMessage();
    }
}
