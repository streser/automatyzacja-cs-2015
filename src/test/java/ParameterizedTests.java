import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParameterizedTests {

    @Test
    @Parameters({
            "2,3,6",
            "3,3,9",
            "4,4,16"
    })
    public void shouldMultipleNumbers(int a, int b, int expected) {
        int result = multiply(a, b);
        Assert.assertEquals(expected, result);
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}
