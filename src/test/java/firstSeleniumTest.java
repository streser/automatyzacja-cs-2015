
    import java.util.regex.Pattern;
    import java.util.concurrent.TimeUnit;
    import org.junit.*;
    import static org.junit.Assert.*;
    import static org.hamcrest.CoreMatchers.*;
    import org.openqa.selenium.*;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.support.ui.Select;

    public class firstSeleniumTest {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @Before
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "https://szkolenia.bananascrum.com";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void test() throws Exception {
            driver.get(baseUrl + "/session/new");
            driver.findElement(By.id("login")).clear();
            driver.findElement(By.id("login")).sendKeys("admin");
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("password");
            driver.findElement(By.name("commit")).click();

//timeline
            driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[1]/a/div")).click();
            driver.findElement(By.xpath("//div[1]/div[2]/div[6]/div[6]/div[5]"));
            Assert.assertTrue(isElementPresent(By.xpath("//div[1]/div[2]/div[6]/div[6]/div[5]")));

            driver.findElement(By.xpath("//div[2]/div[3]/ul/li[4]/a/div")).click();


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
            driver.findElement(By.linkText("Logout")).click();
        }

        @After
        public void tearDown() throws Exception {
            //driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
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


