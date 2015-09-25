package pageobjectpattern;

        import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2015-09-25.
 */
public abstract class Page {


    WebDriver driver;

    public Page(WebDriver driver) {

        this.driver = driver;
    }




}



