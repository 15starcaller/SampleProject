package lesson9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        try (FileReader reader = new FileReader("src/main/resourses/numbers")) {
//            BufferedReader bufferedReader = new BufferedReader(reader);
//            String fromFile = bufferedReader.readLine();
            // System.out.println(fromFile);
            Scanner sc = new Scanner(reader);
            int count = 0;
            int sum = 0;
            while (sc.hasNextInt()) {//ср а
                int a = sc.nextInt();
                sum = sum + a;
                count++;
                System.out.println(a);
            }

            System.out.println(sum/count);

//            int c = 0;
//            while (c != -1) {
//                System.out.print((char) c);
//
//                c = reader.read();
//            } //Ctrl+/
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла\n" + e.getMessage());
        }


    }

}
