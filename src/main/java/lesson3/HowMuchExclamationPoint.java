package lesson3;

import java.util.Locale;
import java.util.Scanner;

public class HowMuchExclamationPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Pull the string with the -!- symbol.");
        String example = scanner.next();//nextLine=getLine
        int ExlPoi = 0;
        for (int i = 0; i < example.length(); i++) {
            System.out.println(example.charAt(i));// Здесь нельзя example[0]='Y';
            if (example.charAt(i) == '!') {
                ExlPoi = ExlPoi + 1;
            }


        }
        System.out.println("There is " + ExlPoi + " exclamation points.");
    }

}





