

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BananasTest extends SeleniumBase {

    public static final By SPRINT_MENU = By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div");
    public static final By SPRINT_LIST_MENU = By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[3]/a/div");
    public static final By BACKLOG_MENU = By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[2]/a/div");
    public static final By TIMELINE_MENU = By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[1]/a");


    @Test
    public void test() throws Exception {
        open();
        login();
        assertElementPresent(By.id("project_id"));

        click(SPRINT_MENU);
        assertPageSourceCointains("Impediments");
        click(SPRINT_LIST_MENU);
        assertPageSourceCointains("test");
        click(BACKLOG_MENU);
        assertPageSourceCointains("Product backlog");
        click(TIMELINE_MENU);
        assertPageSourceCointains("Product backlog");
        logout();
    }


}
