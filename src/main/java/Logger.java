package main.java;

import main.java.destinations.LogDestination;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;

public class Logger {

    private final LogDestinationMapper logDestinationMapper;
    private final HashSet<LogTypes> allowedLogTypes;
    public Logger(LogTypes configLevel, LogDestinationMapper logDestinationMapper, LogTypePriority logTypePriority){
        this.logDestinationMapper = logDestinationMapper;
        this.allowedLogTypes = logTypePriority.allowedTypes(configLevel);
    }

    public void log(LogTypes logTypes,String msg){
        LogMessage logMessage = new LogMessage(LocalDateTime.now(), logTypes, msg);

        List<LogDestination> destinations = this.logDestinationMapper.getLogTypesDestinationMap(logTypes);

        for(LogDestination destination : destinations){
            if(this.allowedLogTypes.contains(logTypes))
                destination.flush(logMessage);
        }
    }

}
