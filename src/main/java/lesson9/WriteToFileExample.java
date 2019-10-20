package lesson9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteToFileExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src\\main\\resourses\\numbers", false)) {
           /* //запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            //запись по символам
            writer.append('\n');
            writer.append('E');*/
           Random rnd=new Random();
            for (int i = 0; i < 20; i++) {
                int number=rnd.nextInt(100);
                writer.write(String.valueOf(number));
writer.write("\n");
            }

            writer.flush();//смывает ьвсе из writer'а в файл
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
