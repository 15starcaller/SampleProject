import lesson2.Function;
import lesson3.SimpleFunction;
import lesson4.Authentication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestSimple {
    @Test
    public void firstTest(){
        int result= Function.minFromTwo(2,3);
        assertEquals(2, result);

    }
    @Test
    public void secondTest(){
        int result= Function.minFromTwo(2,2);
        assertEquals(2, result);

    }
    @Test
    public void negativeTest(){
        int result= Function.minFromTwo(-2,2);
        assertEquals(-2, result);

    }


}
