package com.company;

public class Destination {
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

