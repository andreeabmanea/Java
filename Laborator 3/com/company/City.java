package com.company;
import java.util.*;

public class City {
    private String name;
    private List<Location> nodes = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public City(List<Location> nodes) {
        this.nodes = nodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Location> getNodes() {
        return nodes;
    }

    public void setNodes(List<Location> nodes) {
        this.nodes = nodes;
    }

    public void addLocation(Location node) {
        nodes.add(node);
    }
}
