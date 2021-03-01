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




}
