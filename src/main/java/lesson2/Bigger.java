package lesson2;

public class Bigger {
    public static void main(String[] args) {
        System.out.println("Input two numbers. The program will show the biggest one.");
        int a=0;
        int b=0;
        if (a>b){
            System.out.println("The biggest number is: " + a);
        }

        if (a<b){
            System.out.println("The biggest number is: " + b);
        }

        if (a==b){
            System.out.println("Your numbers are equal.");
        }

    }
}
