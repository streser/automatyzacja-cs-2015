import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedTests {

    @Test
    @Parameters({"2,3,6",
            "3,4,12",
            "4,5,20",
            "5,6,30",
            "6,7,42" })
    public void shouldMultipleNumbers(int a, int b, int expected) {

            expected = multiply(a, b);
            Assert.assertEquals(expected, a * b);

    }

    private int multiply(int a, int b) {
        return a * b;
    }
}
