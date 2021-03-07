package com.company;
import java.time.LocalTime;

public class Museum extends Location implements Payable, Classifiable {
    private double ticketPrice;
    private double ranking;

    public void setTicketPrice(double ticketPrice){
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

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
        System.out.print(getOpeningTime() + " - " + getClosingTime());
        System.out.print(" - ");
        System.out.print(getTicketPrice() + " " + "euro");
        System.out.println();
    }
}
