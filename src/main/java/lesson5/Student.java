package lesson5;

public class Student extends Human implements Polite{
    private int form;//класс это только помещение

    public int getForm() {
        return form;
    }

    public Student(String name, int age, int form) {
        super(name, age);
        this.form = form;
    }

    public void goodBye() {//ctrl+
        System.out.println("Пока-пока");
    }
}
