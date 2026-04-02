package pages;

import core.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    public ProductPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy (accessibility = "title")
    private WebElement titleText;

    public boolean isProductTitlePage() {
        String title = titleText.getText();
        return title.contains("Products");
    }
}
