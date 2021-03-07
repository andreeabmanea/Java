package com.company;

public class Hotel extends Location implements Classifiable {
    private double ranking;

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    @Override
    public double getRanking() {
        return ranking;
    }

    public void displayInfo() {
        System.out.print(getName());
        System.out.print(" - ");
        System.out.print(getAddress());
        System.out.print(" - ");
        System.out.print("score: " + getRanking());
        System.out.println();
    }



}
