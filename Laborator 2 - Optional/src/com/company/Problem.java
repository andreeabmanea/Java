package com.company;

import java.util.*;

/**
 * This represents an implementation of the problem.
 */
public class Problem {
    /**
     * We use the costMatrix with the following rule: costMatrix[i][j] = the cost from i to j
     */
        static int[][] costMatrix;
    /**
     * We use array lists for both sources and destinations, in order to keep track of them (when we add a new source or destination).
     */
        ArrayList<Source> sources;
        ArrayList<Destination> destinations;

        public Problem(int n, int m) {
            costMatrix = new int[n][m];
            sources = new ArrayList<>();
            destinations = new ArrayList<>();
        }

        void setCost(int i, int j, int cost) {

            costMatrix[i][j] = cost;
        }


        public void printMatrix() {
            int i, j;
            for (i = 0; i < costMatrix.length; i++) {
                for (j = 0; j < costMatrix.length; j++)
                    System.out.print(costMatrix[i][j] + " ");
                System.out.println();
            }
        }

        void addSource(Source source, int capacity){
            /**
             * This method allows us to add a source if and only if there isn't already one with the same name.
             */
            int OK = 1;
            for (int i = 0; i < sources.size(); i++)
                if (sources.get(i).equals(source))
                    OK = 0;
                if (OK == 1) sources.add(source);
                source.capacity = capacity;

        }

        void printSources() {
            for (int i = 0; i < sources.size(); i++)
                System.out.print(sources.get(i).getName() + " ");
            System.out.println();
        }

    void addDestination(Destination destination, int demand){
        /**
         * This method allows us to add a destination if and only if there isn't already one with the same name.
         */
        int OK = 1;
        for (int i = 0; i < destinations.size(); i++)
            if (destinations.get(i).equals(destination))
                OK = 0;
        if (OK == 1) destinations.add(destination);
        destination.demand = demand;

    }

    void printDestinations() {
        for (int i = 0; i < destinations.size(); i++)
            System.out.print(destinations.get(i).getName() + " ");
        System.out.println();
    }

    }

