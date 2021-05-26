package com;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class SetLocale {

    public static void setLocale(Locale locale) {

        String baseName = "res/Messages";
        ResourceBundle messages = ResourceBundle.getBundle(baseName, locale);
        String pattern = messages.getString("locale.set");
        Object[] arguments = {"ro"};
        Locale.setDefault(new Locale("ro"));
        String currentLocale = new MessageFormat(pattern).format(arguments);
        System.out.println(currentLocale);
        Locale.forLanguageTag("ro");
    }

    public static void main(String[] args) {
        setLocale(Locale.forLanguageTag("ro"));
    }
}
