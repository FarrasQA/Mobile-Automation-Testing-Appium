package pages;

import core.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class GlobalPage extends BasePage {
    public GlobalPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy (accessibility = "View menu")
    private WebElement viewMenuButton;

    @AndroidFindBy(accessibility = "Login Menu Item")
    private WebElement loginMenuButton;

    public void clickHamburgerMenu() {
        viewMenuButton.click();
    }

    public void clickLoginMenu() {
        loginMenuButton.click();
    }
}
