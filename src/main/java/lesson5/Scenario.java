package lesson5;

public class Scenario {
    public static void main(String[] args) {
        Student st = new Student("Alex", 15, 10);//только с пустымми полями
        Teacher teacher = new Teacher("Tamara Petrovna", 51, "Math");//класс это шаблон описания объекта.
        // Метод - действие объекта
        st.sayHello();
        teacher.sayHello();
        teacher.teach(st);

        /*Human[]people=new Human[5];
        people[0]=new Human("Human1", 10);
        people[1]=new Student("Student", 16, 11);
        people[2]=st;
        people[3]=teacher;
        people[4]=new Teacher("Valentina Ivanovna", 77, "Russian");


        for (int i = 0; i < people.length ; i++) {
            people[i].sayHello();*/
            /*if(people[i]) instanceof Teacher){ ёмкий костыль
        }*/
        Polite[] people = new Polite[5];
        people[0] = new Student("Student2", 10, 7);
        people[1] = new Student("Student", 16, 11);
        people[2] = st;
        people[3] = teacher;
        people[4] = new Teacher("Valentina Ivanovna", 77, "Russian");


        for (int i = 0; i < people.length; i++) {
            people[i].goodBye();
        }
        makeSaySomething(teacher);
    }

    public static void makeSaySomething(Polite polite) {
        polite.goodBye();//Полиморфизм!
    }
}
