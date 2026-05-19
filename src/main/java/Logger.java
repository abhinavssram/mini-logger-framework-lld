package main.java;

import main.java.destinations.LogDestination;

import java.time.LocalDateTime;
import java.util.List;

public class Logger {

    private final LogDestinationMapper logDestinationMapper;
    private final LogFormatter logFormatter;
    private final int minLevel;

    public Logger(LogTypes configLevel, LogDestinationMapper logDestinationMapper){
        this.logDestinationMapper = logDestinationMapper;
        this.logFormatter = new LogFormatter();
        this.minLevel = configLevel.getLevel();
    }

    public void log(LogTypes logTypes, String msg){
        if(logTypes.getLevel() < this.minLevel) return;

        LogMessage logMessage = new LogMessage(LocalDateTime.now(), logTypes, msg);
        String formattedLog = logFormatter.format(logMessage);
        List<LogDestination> destinations = this.logDestinationMapper.getLogTypesDestinationMap(logTypes);

        for(LogDestination destination : destinations){
            destination.flush(formattedLog);
        }
    }

}
