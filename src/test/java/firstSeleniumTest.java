
    import java.util.concurrent.TimeUnit;
    import org.junit.*;
    import static org.junit.Assert.*;

    import org.openqa.selenium.*;
    import org.openqa.selenium.firefox.FirefoxDriver;

    public class firstSeleniumTest {

        public static final By MENU_SPRINT = By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div");
        public static final By BACKLOG_TAB = By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[2]/a/div");
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;

        @Before
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            open();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        private void open() {
            baseUrl = "https://szkolenia.bananascrum.com";
        }

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

        private void assertSourcePageContains(String text) {
            assertTrue(driver.getPageSource().contains(text));
        }

        private void click(By locator) {
            driver.findElement(locator).click();
        }

        private void logOut() {
            click(By.linkText("Logout"));
        }

        private void logIn() {
            driver.findElement(By.id("login")).clear();
            driver.findElement(By.id("login")).sendKeys("admin");
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("password");
            click(By.name("commit"));
        }

        @After
        public void tearDown() throws Exception {
            driver.quit();
            }
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

    }


