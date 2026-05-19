package main.java.destinations;

public class ConsoleOutput implements LogDestination{
    @Override
    public void flush(String formattedLog) {
        System.out.println("[Console] " +formattedLog);
    }
}
