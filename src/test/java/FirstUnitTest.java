import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by Administrator on 2015-09-23.
 */
public class FirstUnitTest {


    @Test

    public void ShouldAddElementToArray() {


        //Given
        LinkedList<Integer> lk = new LinkedList<Integer>();

        //When
        for (int i = 0; i < 5; i++) {
            lk.add(i);
            System.out.println(i);
        }

        //Then
        Assert.assertTrue(lk.contains(3));
        //sprawdza czy element 3 jest na liscie
        Assert.assertFalse(lk.contains(5));
        //aseracja na false
    }


}
