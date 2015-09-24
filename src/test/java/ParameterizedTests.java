import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParameterizedTests {

    // TODO template

    //5 x ++

    @Test
    @Parameters({
            "2,3,6",
            "3,3,9",
    })
    public void sholdMultipleNumbers(int a, int b, int wynik) {

        int result = multiply(a, b);
        Assert.assertEquals(wynik, result);


    }

    private int multiply(int a, int b) {
        return a * b;
    }
}




