package com.company;

/**
 * Represents a destination in the transportation problem.
 * @author Andreea Manea
 */
public class Destination {
    /**
     * Each destination has a name and a capacity.
     */
        String name;
        int demand;
    /**
     * We use this member to make the connection with the coordinate in the cost matrix.
     */
        int to;

        public Destination(String name, int demand) {
            this.name = name;
            this.demand = demand;
            to = Integer.parseInt(String.valueOf(name.charAt(1)));
        }

    @Override
    public boolean equals(java.lang.Object obj) {
        /**
         * This overrides "equals" such that it returns true when two objects have the same name.
         */
        if (obj == null)
            return false;
        if (!(obj instanceof Destination))
            return false;
        Destination destination = (Destination) obj;
        return destination.name.equals(name);
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

