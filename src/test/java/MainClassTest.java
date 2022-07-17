import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {

    @Test
    public void simpleTestFirst() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Test
    public void simpleTestSecond() {
        Assertions.assertTrue(1 + 1 == 2, "the statement isn't true");
    }
}
