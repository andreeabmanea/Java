package com.company;

public class Source {
    int capacity;
    String name;
    SourceType type;

    public enum SourceType {
        WAREHOUSE, FACTORY
    }

    public Source(String name, int capacity) {
        this.capacity = capacity;
        this.name = name;
        System.out.println(name + " " + capacity);
    }

    public Source(String name,SourceType type) {
        this.name = name;
        this.type = type;
        System.out.println(name + " " + "is a" + " " + type);
    }


    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setName(String name) {
        this.name = name;
    }
}
