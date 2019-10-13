package lesson8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 numbers.");
        int a = sc.nextInt();
        int b=sc.nextInt();
        try {
            System.out.println(a/b);
        }
        catch (Exception e){
           //e.printStackTrace(); +
            //e.getMessage(); -
            //System.out.println("It cannot be null.");
        }
    }}