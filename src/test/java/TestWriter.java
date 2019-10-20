import lesson8.littleApp.FileHelper;
import lesson8.littleApp.User;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWriter {

    @Test
    public void testWrite(){
        Map<String, User> map = new HashMap<>();
        map.put("Tolya",new User("Tolya","qwe","qwe"));
        FileHelper.saveToFile("src\\main\\resourses\\user",map);
    }


}