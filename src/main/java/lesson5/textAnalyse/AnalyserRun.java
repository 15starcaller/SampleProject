package lesson5.textAnalyse;


import java.util.Scanner;

public class AnalyserRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a comment.");

        Analyzer[]analyzers=new Analyzer[3];
        analyzers[0]=new LengthAnalyzer(200);
        analyzers[1]=new SpamAnalyzer(new String[]{"кредит", "микрозайм"});
        analyzers[2]=new SwearAnalyzer();
        String text = sc.nextLine();
        for (int i = 0; i < analyzers.length; i++) {
            System.out.println(analyzers[i].analyse(text));
        }



    }
}
