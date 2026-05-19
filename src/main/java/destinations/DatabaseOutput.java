package main.java.destinations;

public class DatabaseOutput implements LogDestination{
    @Override
    public void flush(String formattedLog) {
        System.out.println("[DB] " + formattedLog);
    }
}
