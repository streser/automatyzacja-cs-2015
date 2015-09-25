import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Administrator on 2015-09-24.
 */
public class BananaScrumBasicTest extends SeleniumBase {

    public static final By MENU_SPRINT = By.xpath("//*[@id=\"top-menu\"]/li[4]/a/div");
    public static final By MENU_SPRINTS_LIST = By.xpath("//*[@id=\"top-menu\"]/li[3]/a/div");
    public static final By BACKLOG_MENU = By.xpath("//*[@id=\"top-menu\"]/li[2]/a/div");
    public static final By TIMELINE_MENU = By.xpath("//*[@id=\"top-menu\"]/li[1]/a/div");


    @Test
    public void shouldLoginLogout() throws Exception {
        open();
        login();
        assertTrue(isElementPresent(By.id("project_id")));
        logOut();


    }

    @Test
    public void shouldOpenMenuTabs() throws Exception {


        open();
        login();

        click(MENU_SPRINT);
        assertPageSourceContains("szkolenia");

        click(MENU_SPRINTS_LIST);
        assertPageSourceContains("Sprints list");

        click(BACKLOG_MENU);
        assertPageSourceContains("Product backlog");

        click(TIMELINE_MENU);
        assertPageSourceContains("Project graphs and statistics");
        logOut();

//        driver.findElement(By.name("commit")).click();
//        driver.findElement(By.name("commit")).click();
//        driver.findElement(By.


    }


}
