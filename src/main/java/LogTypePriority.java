package main.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LogTypePriority {
    private final HashMap<LogTypes,Integer> logTypesPriority;

    LogTypePriority(){
        this.logTypesPriority = new HashMap<>();
        this.logTypesPriority.put(LogTypes.DEBUG,1);
        this.logTypesPriority.put(LogTypes.INFO,2);
        this.logTypesPriority.put(LogTypes.WARN,3);
        this.logTypesPriority.put(LogTypes.ERROR,4);
    }

    public void addPriority(LogTypes logTypes,Integer num){
        this.logTypesPriority.put(logTypes,num);
    }

    public HashSet<LogTypes> allowedTypes(LogTypes logTypes){
        int priority = this.logTypesPriority.get(logTypes);

        HashSet<LogTypes> hs = new HashSet<>();

        for(Map.Entry<LogTypes,Integer> entry: this.logTypesPriority.entrySet()){
            LogTypes logtype1 = entry.getKey();
            int val = entry.getValue();
            if(val>=priority){
                hs.add(entry.getKey());
            }
        }

        return hs;
    }
}
