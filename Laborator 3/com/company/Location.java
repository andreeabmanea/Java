package com.company;

import java.util.HashMap;
import java.util.Map;

public abstract class Location {
    private String name;
    private String coordinates;
    private Map<Location, Integer> cost = new HashMap<>();

    public void setCost(Location node, int value){
        cost.put(node, value);

    }

}
