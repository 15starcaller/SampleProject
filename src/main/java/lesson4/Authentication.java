package lesson4;


import java.util.Scanner;

public class Authentication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gotLogin = sc.next();
    }

    public static boolean login(String login, String password) {
        String correctLogin = "pupil";
        String correctPassword = "pupil";

        if (login.equals(correctLogin) && password.equals(correctPassword)) {
            return true;
        }

        return false;
    }

}
