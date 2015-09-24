import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;

public class FirstUnitTest {
    List<String> list;
/*
    @Test
    public void shouldAddElementToArray(){
        //given
        int[] tablica = { 1, 2, 7, 21 };
        //when
        tablica[3] = 23;
        //then
        Assert.assertArrayEquals(tablica, new int[] {1, 2, 7, 23});
    }
*/
    @Before
    public void SetUp(){
        list = new LinkedList<String>();
        list.add("string");
    }

    @Test
    public void shouldAddToArray(){
        //given
        //List<String> list = new LinkedList<String>();
        //when
        //list.add("string");
        //then
        Assert.assertEquals(list.size(), 1);
        Assert.assertSame(list.size(), 1);
        Assert.assertTrue(list.contains("string"));
    }

    @Test
    public void RemoveElementFromArray(){
        //given
        //List<String> list = new LinkedList<String>();
        //when
       // list.add("string");
        list.remove("string");
        //then
        Assert.assertEquals(list.size(), 0);
        Assert.assertTrue(list.isEmpty());
    }
}
