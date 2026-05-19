package main.java.destinations;

import main.java.LogMessage;

public class FileOutput implements LogDestination{
    @Override
    public void flush(LogMessage logMessage) {
        System.out.println("In the file    :" + "["+ logMessage.getTimeStamp() + "]" + " " + "[" + logMessage.getLogTypes()+"]" + " " + logMessage.getMessage());
    }
}
