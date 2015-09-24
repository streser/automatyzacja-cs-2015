import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by Administrator on 2015-09-23.
 */
public class FirstUnitTest {

    static LinkedList<Integer> lk;

    @Before
    public  void setUp() {

        lk = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            lk.add(i);
            System.out.println(i);
        }
    }

    @Test
    public void ShouldAddElementToArray() {

            lk.add(100);

        //Then
        Assert.assertTrue(lk.contains(3));
        //sprawdza czy element 3 jest na liscie
        Assert.assertFalse(lk.contains(5));
        Assert.assertTrue(lk.contains(100));

    }

    @Test
    public void ShouldDeletElementFromArray() {

        for (int i = 4; i >=0; i--) {
            System.out.println(lk.size());
            System.out.println(i);
            lk.remove(i);
        }


        Assert.assertTrue(lk.isEmpty());
       Assert.assertEquals( 0,lk.size());


        Assert.assertFalse(lk.contains(100));





    }
}

//aseracja na false
//        Assert.assertEquals(lk.size(),1);
//sprawdza czy
//
//
// Assert.assertTrue(lk.contains("int"));
