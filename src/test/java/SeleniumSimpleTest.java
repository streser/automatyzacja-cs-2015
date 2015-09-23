import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SeleniumSimpleTest {

    @Test
    public void shouldConnectToBananaScrum() {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAssumeUntrustedCertificateIssuer(false);

        WebDriver driver = new FirefoxDriver(profile);
        driver.get("https://szkolenia.bananascrum.com/login");
        
        driver.close();
    }
}
