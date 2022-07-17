import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MainClassTest {

    @Test
    public void simpleTestFirst() {
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void simpleTestSecond() {
        Assert.assertTrue(1 + 1 == 2);
    }
}
