package lesson8.littleApp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FileHelper {

    public static Map<String, User> readFromFile(String path) {
        Map<String, User> map = new HashMap<>();
        try (FileReader reader = new FileReader(path)) {
            Scanner sc = new Scanner(reader);
//sc.useDelimiter("@");//по умолчанию - пробел
            while (sc.hasNext()) {
                String login = sc.next();
                String password = sc.next();
                String fullName = sc.next();
                User user = new User(login, password, fullName);
                map.put(login, user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static void saveToFile(String path, Map<String, User> users) {
        try (FileWriter writer = new FileWriter(path, false)) {//true добавляет вместо перезаписывания
//            for (Map.Entry<String, User> pair : users.entrySet()) {
//                User userToWrite = pair.getValue();
//                //3апись в файл
//                //...
//            }
            for (User x : users.values()) {
                String text = x.getLogin() + " " + x.getPassword() + " " + x.getFullName();
                writer.write(text);
                writer.write("\n");

            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

