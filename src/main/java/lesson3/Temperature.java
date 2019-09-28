package lesson3;
import java.util.Locale;
import java.util.Scanner;
public class Temperature {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your temperature?");
            float t = 0;
            scanner.useLocale(Locale.ENGLISH);
            t = scanner.nextFloat();
            if (t < 36.5 && t > 36.7) {
                System.out.println("WASTED");
            } else {
                System.out.println("You are fine. Great job!");
            }

        }

}
