import static org.junit.Assert.*;
import org.junit.Test;

public class FirstUnitTest {

@Test
    //adnotacja mowiaca ze metoda jest testem
    public void shouldAddElementToArray() {
        //given
    String[] tablica = new String[3];
        //when
    tablica[0] = "Laptop";
    tablica[1] = "";
    tablica[2] = "Telewizor";
        //then
    assertEquals(tablica[0],"Laptop");
}

}
