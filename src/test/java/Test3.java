import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class Test3 {
    @Test
    public void shouldWriteTest1(){
        System.out.println("Test1");


     }
    @Test
    public void shouldWriteTest2() {
        System.out.println("Test2");

    }
    @Test
    public void shouldWriteTest3() {
        System.out.println("Test3");



    }
    @BeforeClass
    public static void shouldWriteBeforeClass(){
        System.out.println("beforeclass");
    }

    @Before
    public void shouldWriteBefore(){
        System.out.println("before");

    }
    @After
    public void shouldWriteAfter(){
        System.out.println("after");
    }
    @AfterClass
    public static void shouldWriteAfterClass(){
        System.out.println("afterclass");
    }

    @AfterClass
    public static void shouldPrintAfterClass() {
        System.out.println("afterclass1");


    }

    @After
    public void shouldPrintAfter(){
        System.out.println("after1");


    }
    @Before
    public void shouldPrintBefore(){
        System.out.println("before1");

        }
    @BeforeClass
    public static void shouldPrintBeforeClass (){
        System.out.println("beforeclass1");
    }
}

