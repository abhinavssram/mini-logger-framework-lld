package main.java;

import main.java.destinations.ConsoleOutput;
import main.java.destinations.DatabaseOutput;
import main.java.destinations.FileOutput;
import java.util.List;

public class Client {

    public static void main(String[] args){
        LogDestinationMapper logDestinationMapper = new LogDestinationMapper();
        logDestinationMapper.setLogTypesDestination(LogTypes.DEBUG, List.of(new ConsoleOutput()));
        logDestinationMapper.setLogTypesDestination(LogTypes.INFO, List.of(new FileOutput(),new DatabaseOutput()));
        logDestinationMapper.setLogTypesDestination(LogTypes.WARN, List.of(new ConsoleOutput(),new FileOutput()));
        logDestinationMapper.setLogTypesDestination(LogTypes.ERROR, List.of(new ConsoleOutput(),new FileOutput(),new DatabaseOutput()));

        Logger logger = new Logger(LogTypes.DEBUG,logDestinationMapper,new LogTypePriority());

        logger.log(LogTypes.DEBUG,"Value of tensor is : 2");
        logger.log(LogTypes.INFO,"Called PaymentService");
        logger.log(LogTypes.WARN,"Type undefined");
        logger.log(LogTypes.ERROR,"Payment Failed");

    }
}
