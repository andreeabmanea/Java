package lab1;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        tasks();
    }

    public static void tasks() {
        //create the array of strings
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        //generate integer
        int n = (int) (Math.random() * 1_000_000);
        System.out.println("The initial integer is:" + n);

        //modify the integer
        n = n * 3;
        System.out.println("Multiplied by 3: " + n);
        n = n + 0b10101;
        System.out.println("Added binary: " + n);
        n = n + 0xFF;
        System.out.println("Added hexa: " + n);
        n = n * 6;
        System.out.println("Multiplied by 6: " + n);

        //sum of digits
        int sum = 0;
        while (n >= 10) {
            sum = 0;
            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            n = sum;
        }

        System.out.println("The sum of (sum of..) digits:" + sum);

        //accessing elements of array
        System.out.println("Willy-nilly, this semester I will learn " + languages[sum]);

    }
}
