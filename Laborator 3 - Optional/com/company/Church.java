package com.company;

import java.time.LocalTime;

public class Church extends Location implements Visitable {
    public void displayInfo() {
        System.out.print(getName());
        System.out.print(" - ");
        System.out.print(getAddress());
        System.out.print(" - ");
        System.out.print(getOpeningTime() + " - " + getClosingTime());
        System.out.println();
    }
}
