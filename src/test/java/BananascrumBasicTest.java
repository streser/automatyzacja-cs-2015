import org.junit.Test;
import org.openqa.selenium.By;

public class BananascrumBasicTest extends SeleniumBase {

    //public static final String SPRINT_LINK_XPATH = "/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div";
    public static final By SPRINT_MENU = By.xpath("//div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div");
    public static final By SPRINT_LIST_MENU = By.xpath("//div[2]/div[1]/div[2]/div[3]/ul/li[3]/a/div");
    public static final By BACKLOG_MENU = By.xpath("//div[2]/div[1]/div[2]/div[3]/ul/li[2]/a/div");
    public static final By TIMELINE_MENU = By.xpath("//div[2]/div[1]/div[2]/div[3]/ul/li[1]/a/div");
    //private StringBuffer verificationErrors = new StringBuffer();

    @Test
    public void shouldLogInLogOut() throws Exception {
        open();

        login();

        //assertTrue(isElementPresent(By.id("project_id")));

        //click(By.xpath(SPRINT_LINK_XPATH));


        click(SPRINT_MENU);
        assertPageSourceContains("Impediments");


        click(SPRINT_LIST_MENU);
        assertPageSourceContains("Sprints list");


        click(BACKLOG_MENU);
        assertPageSourceContains("Product backlog");


        click(TIMELINE_MENU);
        assertPageSourceContains("Sprint load history");

        logout();
    }

}
