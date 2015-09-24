import com.sun.swing.internal.plaf.synth.resources.synth_sv;
import org.junit.*;

/**
 * Created by Administrator on 2015-09-24.
 */
public class BeforeTest {


    @Test
    public void test1() {
        System.out.println("pierwszy_test");
    }

    @Test
    public void test2() {
        System.out.println("drugi_test");
    }

    @Test
    public void test3() {
        System.out.println("trzeci_test");

    }

    @Before
    public void setup() {
        System.out.println("Before");
    }

    @Before
    public void setup2() {
        System.out.println("Before2");
    }

    @BeforeClass
    public static void BeforeClass() {
        System.out.println("BeforeClass");
    }


    @BeforeClass
    public static void BeforeClass2(){
        System.out.println("BeforeClass2");
    }


    @After
    public void After(){
        System.out.println("After");

    }
    @After
    public void After2(){
        System.out.println("After2");

    }

    @AfterClass
    public static void AfterClass(){
        System.out.println("AfterClass");
    }

    @AfterClass
    public static void AfterClass2(){
        System.out.println("AfterClass2");

    }

}
