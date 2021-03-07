package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class Restaurant extends Location {

    ArrayList<String> menu;

    public Restaurant () {
        menu = new ArrayList<>();
    }

    public void addToMenu(String food){
        menu.add(food);
    }

    public void displayInfo() {
            System.out.print(getName());
            System.out.print(" - ");
            System.out.print(getAddress());
            System.out.print(" - ");
            System.out.print(getOpeningTime() + " - " + getClosingTime());
            System.out.print(" - ");
            System.out.print("Popular dishes: ");
            for (int i = 0; i < menu.size(); i++)
                 System.out.print(menu.get(i) + " ");
            System.out.println();
    }

}
