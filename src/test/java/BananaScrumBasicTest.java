import org.junit.Test;
import org.openqa.selenium.By;

public class BananaScrumBasicTest extends SeleniumBase {
    public static final By BACKLOG_TAB = By.cssSelector("div.backlog");
    public static final By TIME_LINE_TAB = By.cssSelector("div.timeline");
    public static final By SPRINT_TAB = By.cssSelector("div.sprint");

    @Test
    public void shouldLogInLogOut() throws Exception {
        open();
        LogIn();
        assertElementPresent(By.id("project_id"));
        logOut();
    }

    @Test
    public void shouldOpenBacklog() throws Exception {
        open();
        LogIn();
        click(BACKLOG_TAB);
        //driver.findElement(By.linkText("Backlog"));
        assertElementPresent(By.cssSelector("div.item-user-story"));
    }

    @Test
    public void shouldOpenTimeLine() throws Exception {
        open();
        LogIn();
        click(TIME_LINE_TAB);
        assertPageSourceContains("Project graphs and statistics");
    }

    @Test
    public void shouldOpen() throws Exception {
        open();
        LogIn();
        click(SPRINT_TAB);
        assertPageSourceContains("Title123");
    }

}


