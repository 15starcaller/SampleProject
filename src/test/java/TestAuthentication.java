import lesson4.Authentication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAuthentication {

        @Test

        public void testIncorrect(){
            boolean result=Authentication.login("123","123");
            assertEquals(false, result);

        }
        @Test
        public void testCorrect(){
            boolean result=Authentication.login("pupil", "pupil");
            assertEquals(true, result);
        }


}
