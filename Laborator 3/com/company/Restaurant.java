package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class Restaurant extends Location implements Visitable {

    private LocalTime openingTime, closingTime;
    ArrayList<String> menu;

    public Restaurant () {
        menu = new ArrayList<>();
    }

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

    public void addToMenu(String food){
        menu.add(food);
    }

    public void displayMenu(){
        for (int i = 0; i < menu.size(); i++)
            System.out.print(menu.get(i) + " ");
        System.out.println();
    }

}
