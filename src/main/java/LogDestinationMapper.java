package main.java;

import main.java.destinations.LogDestination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogDestinationMapper {
    private final Map<LogTypes, List<LogDestination>> logTypesDestinationMap;

    LogDestinationMapper(){
        this.logTypesDestinationMap = new HashMap<>();
    }


    public void setLogTypesDestination(LogTypes logTypes, List<LogDestination> logDestination) {
        this.logTypesDestinationMap.put(logTypes,logDestination);
    }

    public List<LogDestination> getLogTypesDestinationMap(LogTypes logTypes) {
        return this.logTypesDestinationMap.getOrDefault(logTypes, new ArrayList<>());
    }
}
