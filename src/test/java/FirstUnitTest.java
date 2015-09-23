import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2015-09-23.
 */
public class FirstUnitTest {

    @Test
    public void shouldAddElementToArray(){
        //given
        int[] tablica = { 1, 2, 7, 21 };
        //when
        tablica[3] = 23;
        //then
        Assert.assertArrayEquals(tablica, new int[] {1, 2, 7, 23});
    }
}
