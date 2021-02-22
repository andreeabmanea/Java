package com.company;

public class Problem {
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

