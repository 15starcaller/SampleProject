package lesson2;

public class Paw15 {

    public static boolean isPowerOfTwo(int value) {
        if(Math.sqrt(value)==2) { //wrong
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
    }
}
