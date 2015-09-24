import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2015-09-23.
 */
public class FirstUnitTest {

    String[] nazwa_tablicy;

    @Before
    public void Setup() {
        nazwa_tablicy = new String[4];
    }


    @Test
    public void shouldAddElementToArray() {

        //when
        nazwa_tablicy[0] = "element";


        //then
        Assert.assertTrue(nazwa_tablicy[0].contains("element"));
        System.out.println(nazwa_tablicy[0]);


    }

    @Test
    public void shouldRemoveElementFromArray() {

        //when
        nazwa_tablicy[0] = "element";
        nazwa_tablicy[1] = "element";

        nazwa_tablicy[0] = null;



        //then
        Assert.assertNull(nazwa_tablicy[0]);
    }




}
