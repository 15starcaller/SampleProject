package lesson8.littleApp;


import java.util.List;
import java.util.Scanner;

public class App {
   // public static void lol(String[] args){System.out.println}
    public static void main(String[] args) {
        UserService userService = new UserService();

        User user = new User("admin", "asd","Kirill");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин и пароль: ");
        String log = sc.next();
        String pas=sc.next();




        int answer=-1;
        while(answer !=0){

            System.out.println("1. Просмотреть");
            System.out.println("2. Добавить");
            System.out.println("3. Изменить");
            System.out.println("4. Удалить");
            answer=sc.nextInt();
            switch(answer){
                case 1:
                List<User> allUsers = userService.getAllUsers();
                for (User x : allUsers){
                    System.out.println(x);
                }
                break;
                case 2:
                    System.out.println("Введите логин, пароль и имя пользователя:");
                    log = sc.next();
                    pas=sc.next();
                    String nam=sc.next();
                    User newUser = new User(log,pas,nam);
                    boolean flag = userService.addUser(newUser);
                    if (flag==true){
                        System.out.println("Пользователь добавлен.");
                    }
                    else {
                        System.out.println("Пользователь уже существует.");
                    }
                    break;
                case 3:
                    System.out.println("Введите логин и новые пароль и имя пользователя для изменения:");
                    log = sc.next();
                    pas=sc.next();
                    nam=sc.next();
                    newUser = new User(log,pas,nam);
                    flag = userService.editUser(newUser);
                    if (flag==true){
                        System.out.println("Пароль и имя изменены.");
                    }
                    else {
                        System.out.println("Пароль и имя не изменены. Указанный логин неверен или не существует.");
                    }
                    break;
                case 4:
                    System.out.println("Введите логин пользователя для удаления пользователя:");
                    log = sc.next();
                    flag = userService.deleteByLogin(log);
                    if (flag==true){
                        System.out.println("Пользователь удален.");
                    }
                    else {
                        System.out.println("Пользователь не удален. Указанный логин неверен или не существует.");
                    }
                    break;
                default:
                    break;


            }
        }
    }

    // user serviceScanner auth while считывание команды switch(кейсы
    /*switch(command){
    case 2:
    System.out.println("Input login to delete");
    sc.next();
    userService deleteByLogin()*/
}
