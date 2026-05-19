package main.java;

import main.java.destinations.LogDestination;

import java.time.LocalDateTime;
import java.util.List;

public class Logger {

    private final LogDestinationMapper logDestinationMapper;
    private final int minLevel;

    public Logger(LogTypes configLevel, LogDestinationMapper logDestinationMapper){
        this.logDestinationMapper = logDestinationMapper;
        this.minLevel = configLevel.getLevel();
    }

    public void log(LogTypes logTypes, String msg){
        if(logTypes.getLevel() < this.minLevel) return;

        LogMessage logMessage = new LogMessage(LocalDateTime.now(), logTypes, msg);
        List<LogDestination> destinations = this.logDestinationMapper.getLogTypesDestinationMap(logTypes);

        for(LogDestination destination : destinations){
            destination.flush(logMessage);
        }
    }

}
