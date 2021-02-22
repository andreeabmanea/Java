package com.company;

public class Main {

    public static void main(String[] args) {

        //we create the instances of the problem
        Source s1 = new Source("S1", 10);
        Source s2 = new Source("S2", 35);
        Source s3 = new Source("S3", 25);
        Destination d1 = new Destination("D1",20);
        Destination d2 = new Destination("D2",25);
        Destination d3 = new Destination("D3",25);
        s1 = new Source(s1.name,Source.SourceType.FACTORY);
        s2 = new Source(s2.name, Source.SourceType.WAREHOUSE);
        s3 = new Source(s3.name, Source.SourceType.WAREHOUSE);

        //we set the Matrix of costs
        //to be continued
        Problem myMatrix = new Problem(1,1, 1);

        //we print the Matrix of costs

    }
}

class Source{

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

class Destination {
    String name;
    int demand;

    public Destination(String name, int demand) {
        this.name = name;
        this.demand = demand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDemand() {
        return demand;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }
}

class Problem {
    int[][] costMatrix;
    int cost;
    int i;
    int j;

    public Problem(int i, int j, int cost) {
        this.i = i;
        this.j = j;
        this.cost = cost;
        System.out.println("S" + j + "->D" + i + ":" + cost);
    }

}

class Object {
    @Override
    public String toString() {
        return super.toString();
    }
}
