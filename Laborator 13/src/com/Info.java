package com;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.MessageFormat;
import java.util.*;

public class Info {
    private ResourceBundle messages;

    public Info(){

    }
    public String getInfo() {
        String baseName = "res/Messages";
        Locale locale = Locale.getDefault();
        messages = ResourceBundle.getBundle(baseName, locale);
        String current = new MessageFormat(messages.getString("info")).format(new Object[]{locale});
        //weekdays
        DateFormatSymbols symbols = new DateFormatSymbols(locale);
        String[] weekdays = symbols.getWeekdays();
        List<String> days = new ArrayList<>();
        for (int i = 0; i < weekdays.length; i++)
            days.add(weekdays[i]);
        days.remove(0);

        //months
        String[] monthsString = symbols.getMonths();
        List<String> months = new ArrayList<>();
        for (int i = 0; i < monthsString.length; i++)
            months.add(monthsString[i]);
        months.remove(monthsString.length - 1);

        //today's date
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        Date today = new Date();

        return current + "\n" + getCountry() + " " + locale.getDisplayCountry() + "\n" + getLanguage() + " " + locale.getDisplayLanguage() + "\n" +
                getCurrency() + " " + Currency.getInstance(locale).getCurrencyCode() + "\n" + getWeekDays() + " " + days.toString() + "\n" +
                getMonths() + " " + months.toString() + "\n" + getToday() + " " + dateFormat.format(today);
    }

    public void printInfo() {
        System.out.println(getInfo());
    }

    public String getCountry() {
        return messages.getString("country");
    }

    public String getLanguage() {
        return messages.getString("language");
    }

    public String getCurrency() {
        return messages.getString("currency");
    }

    public String getWeekDays() {
        return messages.getString("weekdays");
    }

    public String getMonths() {
        return messages.getString("months");
    }

    public String getToday() {
        return messages.getString("today");
    }
}
