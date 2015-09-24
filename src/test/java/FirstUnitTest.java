import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class FirstUnitTest {

    // @BeforeClass -> odpali sie przed wszystkimi testami tylko raz
    // @Before -> odpali sie przed kazdym testem
    // @Test -> test
    // @After -> odpali sie po kazdym tescie
    // @After Class -> po wszystkich testach

    // - dodawanie przedmiotu do listy
    // - usuwanie przedmiotu z listy

    List<String> list;

    @Before
    public void setUp() {
        list = new LinkedList<String>();
    }

    @Test
    public void shouldAddElementToList() {
        // when
        list.add("string");

        // then
        Assert.assertEquals(1, list.size());
        Assert.assertSame(1, list.size());
        Assert.assertTrue(list.contains("string"));
    }

    @Test
    public void shouldRemoveElementFromList() {
        // given
        list.add("string");

        // when
        list.remove("string");

        // then
        Assert.assertTrue(list.isEmpty());
    }

}
