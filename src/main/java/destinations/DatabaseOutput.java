package main.java.destinations;

import main.java.LogMessage;

public class DatabaseOutput implements LogDestination{
    @Override
    public void flush(LogMessage logMessage) {
        System.out.println("In the DB      :" + "["+ logMessage.getTimeStamp() + "]" + " " + "[" + logMessage.getLogTypes()+"]" + " " + logMessage.getMessage());
    }
}
