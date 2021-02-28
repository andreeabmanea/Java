package com.company;

import java.util.Objects;

/**
 * Represents a source in the transportation problem.
 * @author Andreea Manea
 */
public abstract class Source {
    /**
     * Each source has a name and a capacity.
     */
    String name;
    int capacity;
    /**
     * We use this member to make the connection with the coordinate in the cost matrix.
     */
    int from;

    public Source(String name, int capacity) {

        this.capacity = capacity;
        this.name = name;
        from = Integer.parseInt(String.valueOf(name.charAt(1)));
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        /**
         * This overrides "equals" such that it returns true when two objects have the same name.
         */
        if (obj == null)
            return false;
        if (!(obj instanceof Source))
            return false;
        Source source = (Source) obj;
        return source.name.equals(name);
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
