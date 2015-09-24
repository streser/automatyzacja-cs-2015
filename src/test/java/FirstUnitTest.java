import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015-09-23.
 */
public class FirstUnitTest {

    @Before
    public void setup() {
    }

    @Test
    public void shoudAddElementToArray() {
        //given
        List<String> myList = new ArrayList<String>();

        //when
        myList.add("Ola");

        //then
        Assert.assertTrue(myList.contains("Ola"));
        Assert.assertFalse(myList.contains("Ala"));
        Assert.assertFalse(myList.contains("Tomasz"));
        Assert.assertFalse(myList.contains("Lukas"));

    }

    @Test
    public void shoudAddElementfromList() {
        //given
        List<String> myList = new ArrayList<String>();
        myList.add("Ola");


        //when
        myList.remove("Ola");

        //then}
        Assert.assertTrue(myList.isEmpty());
    }


    public void nazwa() {
    }

}