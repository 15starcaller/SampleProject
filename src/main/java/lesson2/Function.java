package lesson2;

public class Function {
    public static void main(String[] args) {
        System.out.println("Input two numbers. The program will show the smallest one.");
        int min = minFromTwo(2,3);
        System.out.println("The smallest number is: " + min);
    }
    public static int minFromTwo(int a, int b){
        if (a >= b) {
            return b;
        } else {
            return a;
        }
    }
}
