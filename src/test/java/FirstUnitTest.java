import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class FirstUnitTest {
    List<String> list;



    @Test
    public void shouldAddElementToArray() {
        //given
        List lista1 = new ArrayList();


        //when

        lista1.add("Asia");
        //then
        Assert.assertEquals(lista1.size(), 1);
        Assert.assertEquals(lista1.get(0), "Asia");
    }

    @Test
    public void shouldAddElementToArray2() {
        // given
        List<String> list = new LinkedList<String>();

        //when
        list.add("string");

        //then
        Assert.assertEquals(list.size(), 1);
        Assert.assertTrue(list.contains("string"));
    }
    @Test
    public void shouldRemoveFromArray() {
        //given
        List<String> list = new LinkedList<String>();

        //when
        list.add("string");
        list.add("string");
        list.remove("string");

        //then
        Assert.assertEquals(list.size(), 1);
    }

    @Before
    public void add(){
        System.out.println("before2");{

        }

    }
}



// @BeforeClass -> dopali sie przed wszystimi testami tylko raz
// @Before -> odpali sie przed ka¿dym testem
// @Test -> test
// @After -> odpali sie po ka¿dym teœcie
// @After Class-> po wszystkich testach



// - dodawanie przedmiotu do listy
// - usuwanie przedmiotu z listy
// - konwersja listy do array list. toArray



