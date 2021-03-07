package com.company;

import java.util.ArrayList;

public class TravelPlan {
    String cityName;
    ArrayList<String> preferences;

    TravelPlan(String cityName) {
        this.cityName = cityName;
        preferences = new ArrayList<String>();
    }

    public void setPreferences(Location location) {
        preferences.add(location.getName());

    }

    public void printPreferences() {
        for (int i = 0; i < preferences.size(); i++)
            System.out.println(i + 1 + "." + " " + preferences.get(i));
    }
}
