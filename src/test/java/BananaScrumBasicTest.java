import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BananaScrumBasicTest extends SeleniumBase {

    public static final By SPRING_MENU = By.xpath("//div[2]/div[1]/div[2]/div[3]/ul/li[4]/a");
    public static final String SPRING_LIST_MENU = "//div[2]/div[1]/div[2]/div[3]/ul/li[4]/a";
    public static final String BACKLOG_MENU = "//div[2]/div[1]/div[2]/div[3]/ul/li[3]/a";
    public static final String TIMLINE_MENU = "//div[2]/div[1]/div[2]/div[3]/ul/li[2]/a";

    @Test
    public void shouldLogInn() throws Exception {
        open();
        loggInn();
        assertElementPresent(By.id("project_id"));
        logOut();


    }


    @Test
    public void shouldGoToFirst() throws Exception {
        open();
        loggInn();
        click(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a"));
        assertPageSourceContains("Impediments");
    }


    @Test
    public void test4() throws Exception {
        open();
        loggInn();
        click(By.xpath(SPRING_LIST_MENU));
        assertPageSourceContains("Impediments");
        click(By.xpath(BACKLOG_MENU));
        assertPageSourceContains(" Sprints list ");
        click(By.xpath(TIMLINE_MENU));
        assertPageSourceContains("User Story");
    }

}




