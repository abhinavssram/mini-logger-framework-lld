package main.java.destinations;

import main.java.LogMessage;

public class ConsoleOutput implements LogDestination{
    @Override
    public void flush(LogMessage logMessage) {
        System.out.println("In the console :" + "["+ logMessage.getTimeStamp() + "]" + " " + "[" + logMessage.getLogTypes()+"]" + " " + logMessage.getMessage());
    }
}
