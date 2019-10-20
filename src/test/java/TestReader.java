import lesson8.littleApp.FileHelper;
import lesson8.littleApp.User;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReader {

    @Test
    public void testRead(){
        Map<String, User> map =
        FileHelper.readFromFile("src\\main\\resourses\\user");
        assertEquals(1,map.size());
    }


}