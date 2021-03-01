package com.company;

import java.time.LocalTime;

public class Church extends Location implements Visitable, Payable {
    private LocalTime openingTime, closingTime;
    private double ticketPrice;

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
}
