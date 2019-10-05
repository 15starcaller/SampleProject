package lesson5;

public class Teacher extends Human implements Polite{

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);//обращение к родителю
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void sayHello() {
        System.out.println("Здравствуйте, меня зовут "+name);
       //super.sayHello();
    }

    public void teach(Student student) {
        student.sayHello();
    }

    public void goodBye() {
        System.out.println("До свидания");
    }
}

