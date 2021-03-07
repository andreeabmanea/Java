package com.company;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public abstract class Location implements Visitable, Comparable<Location> {
    private String name;
    private String address;
    private Map<Location, Integer> cost = new HashMap<>();
    private LocalTime openingTime, closingTime;

    //if we do not explicitly set a program, a location will have the default 9:30 - 20:00
    Location(){
        openingTime = setDefaultOpeningTime();
        closingTime = setDefaultClosingTime();
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setOpeningTime(LocalTime openingTime){
        this.openingTime = openingTime;
    }

    public void setClosingTime(LocalTime closingTime){
        this.closingTime = closingTime;
    }

    public void setCost(Location node, int value){
        cost.put(node, value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Location other) {
        if (other == null) {
            return 0;
        }
        return this.openingTime.compareTo(other.getOpeningTime());
    }
}
