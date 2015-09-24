import org.junit.*;


public class cwiczenieTest {

    @BeforeClass
    public static void Setup(){
        System.out.println("beforek");

    }
    @BeforeClass
    public static void Setup2(){
        System.out.println("beforek drugi");
    }
    @Before
    public void Before(){
        System.out.println("przed kazdym testem");
    }

    @Before
    public void Before2(){
        System.out.println("przed kazdym testem drugi");
    }

    @Test
    public void Test1(){
        System.out.println("cos mniej dramatycznego");
    }
    @Test
    public void Test2(){
        System.out.println("cos jeszcze mniej dramatycznego");
    }
    @Test
    public void Test3(){
        System.out.println("cos zupe³nie nie dramatycznego");
    }

    @After
    public void After(){
        System.out.println("ppo kazdym tescie");
    }

    @After
    public void After2(){
        System.out.println("ppo kazdym tescie dwa ");
    }
    @AfterClass
    public static void Jakkolwiek (){
        System.out.println("afterek");
    }

    @AfterClass
    public static void Jakkolwiek2 (){
        System.out.println("afterek drugi");
    }
}

