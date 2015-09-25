package pageobjectpattern;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.ui.ExpectedCondition;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2015-09-25.
 */
public abstract class Page {


    WebDriver driver;

    public Page(WebDriver driver) {

        this.driver = driver;
    }

    void waitFor(By locator){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait .until(ExpectedConditions.presenceOfElementLocated(locator));

    }


}



