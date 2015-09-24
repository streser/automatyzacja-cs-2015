import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedTests {

    @Test

    @Parameters({"3 ,3 ,9", "1 , 3 , 3"})
    public void shouldMultipleNumbers(int a, int b, int x) {
        // when
        int result = multiply(a, b);
        // then
        Assert.assertEquals(x, result);

    }

    private int multiply(int a, int b) {
        int y = a * b;
        return y;
    }




}
