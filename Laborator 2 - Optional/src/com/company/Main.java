package com.company;

public class Main {
    /**
     * This is the main method which makes use of
     * Source, Destination, Warehouse, Factory, Problem & Solution classes.
     * We create instances of our transportation problem.
     * @param args Unused.
     * @return Nothing.
     */

    public static void main(String[] args) {

        //we create the instances of the problem
        Factory source0 = new Factory("S0", 10);
        Warehouse source1 = new Warehouse("S1", 35);
        Warehouse source2 = new Warehouse("S2", 25);

        Destination destination0 = new Destination("D0",20);
        Destination destination1 = new Destination("D1",25);
        Destination destination2 = new Destination("D2",25);

        Problem myProblem = new Problem(3, 3);
        myProblem.setCost(0, 0, 2);
        myProblem.setCost(0, 1, 3);
        myProblem.setCost(0, 2, 1);
        myProblem.setCost(1, 0, 5);
        myProblem.setCost(1, 1, 4);
        myProblem.setCost(1, 2, 8);
        myProblem.setCost(2, 0, 5);
        myProblem.setCost(2, 1, 6);
        myProblem.setCost(2, 2, 8);

        System.out.println("The cost matrix of the problem is:");
        myProblem.printMatrix();
        System.out.println();

        myProblem.addSource(source0, source0.capacity);
        myProblem.addSource(source1, source1.capacity);
        myProblem.addSource(source2, source2.capacity);
        Factory source3 = new Factory("S0", 12);
        myProblem.addSource(source3, source3.capacity); //source3 will not be added as an instance to the problem since it has the same name as source0
        myProblem.printSources();

        myProblem.addDestination(destination0, destination0.demand);
        myProblem.addDestination(destination1, destination1.demand);
        myProblem.addDestination(destination2, destination2.demand);
        myProblem.printDestinations();

        Solution mySolution = new Solution(3,3);
        mySolution.findSolution();




    }
}