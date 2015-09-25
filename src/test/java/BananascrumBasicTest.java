import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class BananascrumBasicTest extends SeleniumBase {

    public static final By MENU_SPRINT = By.xpath("//div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div");
    public static final By BACKLOG_TAB = By.xpath("//div[2]/div[1]/div[2]/div[3]/ul/li[2]/a/div");

    @Test
    public void test() throws Exception {
        driver.get(baseUrl + "/session/new");
        logIn();
        //sprint_tab
        click(MENU_SPRINT);
        assertSourcePageContains("Turtle");
//backlog  assertTrue(driver.getPageSource().contains
        click(BACKLOG_TAB);
        assertSourcePageContains(" User Story");

            /*
            driver.findElement(new By.ByXPath("//html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div")).click();
            isElementPresent(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr[2]/td[2]/a"));
            Assert.assertTrue(isElementPresent("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr[2]/td[2]/a"));

            driver.findElement(new By.ByXPath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[2]/a/div")).click();
            isElementPresent(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[3]/ul/li/div[5]/div[2]"));
            Assert.assertTrue(isElementPresent("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[3]/ul/li/div[5]/div[2]"));

            driver.findElement(new By.ByXPath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[1]/a/div")).click();
            isElementPresent(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[3]/ul/li/div[5]/div[2]"));
            Assert.assertTrue(isElementPresent("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[3]/ul/li/div[5]/div[2]"));
*/
        assertTrue(isElementPresent(By.id("project_id")));
        logOut();
    }

}




