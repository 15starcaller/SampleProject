package lesson3;

import java.util.Locale;
import java.util.Scanner;
// E кин = m ⋅ v 2 2
//сложн=зеркальная ли строка
public class SimpleFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);


        //example = example.toLowerCase();

        int m = 0;
        System.out.println("Input the mass.");
m=scanner.nextInt();

        int v = 0;
        System.out.println("Input the velocity");
        v=scanner.nextInt();

        int E=(m*v*v)/2;

        System.out.println("The cinetic energy is " +E);

        }

}

//метод ex1.equals(ex2) для сложных обьектов



