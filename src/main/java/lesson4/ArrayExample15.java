package lesson4;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample15 {
    public static void main(String[]args){
        Random rnd=new Random();
        rnd.nextInt();
        //mas[0]=rnd.nextInt();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[]mas=new int[n]; //все массивы здесь динамические,несмотря на такое написание
        for (int i = 0; i < mas.length; i++) {
            mas[i]=346;
            System.out.println(mas[i]);
        }
//float.compare(5.0, 6.0)
    }
    public static int countAverage(int[] arr){
        int count=0;

        for (int i = 0; i < arr.length; i++) {

                count++;
        }
        int sum=0;
        int average=0;
        return average;
    }

}
