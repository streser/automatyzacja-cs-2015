import org.junit.*;

public class BeforeTest {

    @Before
    public void Napis() {
        System.out.println("BEFORE test 0");
    }
    @BeforeClass
    public static void Napis1() {
        System.out.println("BEFORE CLASS test 1");
    }
    @AfterClass
    public static void Napis2() {
        System.out.println("AFTER CLASS test 2");
    }
    @After
    public void Napis3() {
        System.out.println("AFTER test 3");
    }
    @Before
    public void Napis00() {
        System.out.println("BEFORE test 00");
    }
    @BeforeClass
    public static void Napis11() {
        System.out.println("BEFORE CLASS test 11");
    }
    @AfterClass
    public static void Napis22() {
        System.out.println("AFTER CLASS test 22");
    }
    @After
    public void Napis33() {
        System.out.println("AFTER test 33");
    }
    @Test
    public void Test() {
        System.out.println("Test 0");
    }
    @Test
    public void Test1() {
        System.out.println("Test 1");
    }

    @Test
    public void Test2() {
        System.out.println("Test 2");
    }

    @Test
    public void Test3() {
        System.out.println("Test 3");
    }
}

