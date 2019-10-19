package lesson9;


import lesson8.littleApp.User;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserFromFile {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        try (FileReader reader = new FileReader("src/main/resourses/user")) {
            Scanner sc = new Scanner(reader);

            while (sc.hasNext()) {
                String login = sc.next();
                String password = sc.next();
                String fullName = sc.next();
                User user = new User(login, password, fullName);
                userList.add(user);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из файла\n" + e.getMessage());
        } catch (NoSuchElementException e) {
            System.err.println("Неверный формат данных.");}
            for (User x : userList) {
                System.out.println(x);

            }
        }

    }
