package com.company;
import java.time.LocalTime;

public class Museum extends Location implements Visitable, Payable, Classifiable {
    private LocalTime openingTime, closingTime;
    private double ticketPrice;
    private double ranking;

    public void setOpeningTime(LocalTime openingTime){

        this.openingTime = openingTime;
    }

    public void setClosingTime(LocalTime closingTime){

        this.closingTime = closingTime;
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

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
}
