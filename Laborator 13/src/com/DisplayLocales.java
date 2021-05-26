package com;

import java.io.IOException;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayLocales {

    public static void displayLocales() {
        String baseName = "res/Messages";
        ResourceBundle messages = ResourceBundle.getBundle(baseName);
        System.out.println(messages.getString("locales"));
        Locale availableLocales[] = Locale.getAvailableLocales();
        for (Locale locale : availableLocales) {
            System.out.println(locale.getCountry() + "\t" + locale.getDisplayLanguage(locale));
        }
    }

    public static void main(String args[]) throws IOException {
        displayLocales();
    }
}
