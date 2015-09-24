import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedTest {
   @Test
   @Parameters({"2, 3, 6", "4, 5, 20", "1, 4, 4", "3, 3, 9", "5, 5, 25"})
    public void shouldMultiplayNumbers(int a, int b, int wynik){

           int wynik1 = multiply(a,  b);
           Assert.assertEquals(wynik, wynik1);
           System.out.println(a+"*"+b+"="+wynik);
       }

    private int multiply(int a, int b) {
        return a * b;
    }
}
