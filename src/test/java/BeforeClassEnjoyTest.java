 import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Administrator on 2015-09-24.
 */
public class BeforeClassEnjoyTest {


    @BeforeClass
    public static void beforeClassTest() {


        System.out.println("BeforeClass");

    }


    @Test
    public void test1() {


        System.out.println("test1");

    }

    @Test
    public void test2() {


        System.out.println("test2");

    }

    @Test
    public void test3() {


        System.out.println("test3");

    }

    @AfterClass

    public static void afterClass() {


        System.out.println("AfterClassTest");

    }


}
