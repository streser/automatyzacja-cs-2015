import org.junit.*;

public class BeforeTest {

    @BeforeClass
    public static void shouldPrintBeforeClass1(){
        System.out.println("beforeClass1");
    }

    @AfterClass
    public static void shouldPrintAfterClass1(){
        System.out.println("afterClass1");
    }
    @BeforeClass
    public static void shouldPrintBeforeClass2(){
        System.out.println("beforeClass2");
    }

    @AfterClass
    public static void shouldPrintAfterClass2(){
        System.out.println("afterClass2");
    }
    @Before
    public void shouldPrintBefore1(){
        System.out.println("before1");
    }

    @After
    public void shouldPrintAfter1(){
        System.out.println("after1");
    }
    @Before
    public void shouldPrintBefore2(){
        System.out.println("before2");
    }

    @After
    public void shouldPrintAfter2(){
        System.out.println("after2");
    }

    @Test
    public void sholudPrintTest1() {
        System.out.println("Test1");
    }

    @Test
    public void sholudPrintTest2() {
        System.out.println("Test2");
    }

    @Test
    public void sholudPrintTest3() {
        System.out.println("Test3");
    }
}

