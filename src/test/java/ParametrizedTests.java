import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedTests {

    @Test
    @Parameters({
            "1, 100, 100",
            "2, 2, 4",
            "3, 3, 9",
            "4, 4, 16",
            "5, 5, 25",
            "6, 6, 36",
            "7, 7, 49",
            "8, 8, 64",
            "9, 9, 81",


    })

    public void shouldMultipleNumbers(int p1, int p2, int expected) {

        int resultofMultiply = multiply(p1, p2);

        Assert.assertEquals(expected, resultofMultiply);
        Assert.assertEquals(expected, resultofMultiply);
        Assert.assertEquals(expected, resultofMultiply);
        Assert.assertEquals(expected, resultofMultiply);
        Assert.assertEquals(expected, resultofMultiply);
        Assert.assertEquals(expected, resultofMultiply);
        Assert.assertEquals(expected, resultofMultiply);
        Assert.assertEquals(expected, resultofMultiply);
        Assert.assertEquals(expected, resultofMultiply);


    }


    private int multiply(int a, int b) {

        return a * b;
    }


}
