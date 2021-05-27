package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayLocales {

    static List<String> available = new ArrayList<>();

    public static void displayLocales() {
        String baseName = "res/Messages";
        Locale locale = Locale.getDefault();
        ResourceBundle messages = ResourceBundle.getBundle(baseName, locale);
        String locales = messages.getString("locales");
        System.out.println(locales);
        for (String loc : SetLocale.getLocales()) {
            available.add(loc);
        }
        System.out.println(available.toString());
    }
}
