package main.java.destinations;

public class FileOutput implements LogDestination{
    @Override
    public void flush(String formattedLog) {
        System.out.println("[FILE] " + formattedLog);
    }
}
