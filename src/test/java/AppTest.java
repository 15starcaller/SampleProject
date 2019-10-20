import com.github.javafaker.Faker;
import lesson8.littleApp.User;
import lesson8.littleApp.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void addMillion(){
        Faker faker = new Faker();

        long begin = System.currentTimeMillis();
        UserService userService = new UserService();
        for(int i = 0 ; i < 1000000; i++){
            User randomUser = new User(faker.dog().name().replaceAll(" ","")+faker.address().firstName().replaceAll(" ",""),"asd","asdMOSCOW");
        }
        userService.saveData();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }


}
