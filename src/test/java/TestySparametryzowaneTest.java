import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class TestySparametryzowaneTest {
    @Test
    @Parameters({
            "3, 3, 9",
            "4, 4, 16",
            "5, 5, 25",
            "6, 6, 36"})
    public void Mnozenie(int a, int b, int expected) {
        int result = a*b;
       Assert.assertEquals(expected, result);

    }

    private int multiply(int a, int b) {
        return a*b;
    }
}
