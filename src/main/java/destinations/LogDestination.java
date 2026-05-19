package main.java.destinations;

import main.java.LogMessage;

public interface LogDestination {
    void flush(LogMessage logMessage);
}
