package app;

import com.DisplayLocales;
import com.Info;
import com.SetLocale;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class InputHandler {

    static SetLocale setter = new SetLocale();
    static Info info = new Info();

    public static String getInvalid() {
        String baseName = "res/Messages";
        Locale locale = Locale.getDefault();
        ResourceBundle messages = ResourceBundle.getBundle(baseName, locale);
        return messages.getString("invalid");
    }

    public static void handleInput(String input) {
        if (input.equals("locales")) {
            DisplayLocales.displayLocales();
        }
        else if (input.contains("locale.set")) {
            List<String> inputSplit = Arrays.asList(input.split(" "));
            setter.setLocale(inputSplit.get(1));
        }
        else if (input.equals("info")) {
            info.getInfo();
            info.printInfo();
        }
        else System.out.println(getInvalid());;
    }
}
