package main.java;

import java.time.LocalDateTime;

public class LogMessage {
    private final LocalDateTime timeStamp;
    private final LogTypes logTypes;
    private final String message;


    LogMessage(LocalDateTime localDateTime, LogTypes logTypes, String message){
        this.timeStamp = localDateTime;
        this.logTypes = logTypes;
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public LogTypes getLogTypes() {
        return logTypes;
    }

    public String getMessage() {
        return message;
    }
}
