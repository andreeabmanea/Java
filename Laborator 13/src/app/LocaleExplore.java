package app;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocaleExplore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String baseName = "res/Messages";


        while (true) {
            Locale locale = Locale.getDefault();
            ResourceBundle messages = ResourceBundle.getBundle(baseName, locale);
            System.out.println(messages.getString("prompt"));
            String input = scanner.nextLine();
            if (input.equals("stop"))
                break;
            InputHandler.handleInput(input);

        }

    }
}
