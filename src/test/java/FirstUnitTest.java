import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//public class FirstUnitTest {
//@BeforeClass (uruchomi sie tylko raz przed zestawem tesow) - > metoda musi byc static
//@Before -> odpali sie przed kazdym testem
//@Test -> test
//@After -> odpali sie po kazdym tescie
//@After Class - > metoda musi byc static


public class FirstUnitTest {
    //static List<Object> spis;
    static List<String> lista;
    @BeforeClass
    public static void setUp() {
        lista = new ArrayList<String>();
        //spis = new ArrayList<Object>();
    }

    @Test
    public void shouldAddElementToList() {

        lista.add("Adam");
        lista.add("Piotr");

        assertArrayEquals(lista.toArray(), new String[]{"Adam", "Piotr"});

        //usuwanie z listy

    }

    /*@Test
    public void checkIfStringHasDigits() {
        spis.add(new Integer(12345));
        assertEquals(spis.get(0),12345);
    }*/

    @After
    public void usunElementListy() {
        lista.remove("Adam");
        assertEquals(1, lista.size());

    }
}