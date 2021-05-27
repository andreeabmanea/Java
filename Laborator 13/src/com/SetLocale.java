package com;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class SetLocale {

    private ResourceBundle messages;
    static List<String> locales = Arrays.asList("ro", "en_GB");
    String language;
    String country;

    public static List<String> getLocales() {
        return locales;
    }

    public SetLocale() {

    }

    public void setLocale(String input) {
        if (locales.contains(input)) {
            List<String> inputSplit = Arrays.asList(input.split("-"));
            language = inputSplit.get(0);
            country = inputSplit.get(0);
        } else {
            language = "en";
            country = "GB";
        }
        Locale.setDefault(new Locale(language, country));
        String baseName = "res/Messages";
        Locale locale = Locale.getDefault();
        messages = ResourceBundle.getBundle(baseName, locale);
        Object[] argument = {locale};
        String pattern = messages.getString("locale.set");
        String currentLocale = new MessageFormat(pattern).format(argument);
        System.out.println(currentLocale);
    }

}
