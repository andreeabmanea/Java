package com.company;
import java.util.*;

public class City {
    private String name;
    private List<Location> nodes = new ArrayList<>();
    public ArrayList<Location> visitableNotPayable;

    public City(String name) {
        this.name = name;
        visitableNotPayable = new ArrayList<>();
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
        if (node instanceof Visitable && !(node instanceof Payable))
            visitableNotPayable.add(node);
    }

    public void sortByOpeningHours(ArrayList<Location> locations){
            Collections.sort(locations, Location::compareTo);
    }


    public void printFreeLocations(ArrayList<Location> locations) {
        System.out.println();
        System.out.println(" - Locations that are Visitable, but not Payable, sorted by their opening hours:");
        for (int i = 0; i < locations.size(); i++)
            System.out.println(locations.get(i) + " " + locations.get(i).getOpeningTime());
    }

}


