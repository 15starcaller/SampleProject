package lesson3;
import java.util.Locale;
import java.util.Scanner;
public class Cycle_Error {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        float L=0;
        System.out.println("Input the length.");
        L = scanner.nextFloat();

        float E=0;
        System.out.println("Input the margin of error.");
        E = scanner.nextFloat();

        float pL=0;
        System.out.println("Input the pupil's length.");
        pL = scanner.nextFloat();


        if(pL>=L+E && pL<=L-E){
            System.out.println("Incorrect value.");
        } else {
            System.out.println("Correct value.");
        }
    }

}
