import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2015-09-23.
 */
public class FirstUnitTest {

    @Test
    public void shouldAddElementToArray()
    {
        //given
        String[] nazwa_tablicy = new String[4];
        //when
        nazwa_tablicy[0] = "element";


        //then
        Assert.assertTrue(nazwa_tablicy[0].contains("element"));


    }




}
