package pages;

import core.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AddToCartPage extends BasePage {
    public AddToCartPage(AppiumDriver driver) { super(driver);}

    @AndroidFindBy (uiAutomator = "new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/productIV\").instance(0)")
    private WebElement backpackGreenProductButton;

    @AndroidFindBy (accessibility = "Tap to add product to cart")
    private WebElement addToCartButton;

    @AndroidFindBy (id = "com.saucelabs.mydemoapp.android:id/cartTV")
    private WebElement displayNumberItemsCart;

    public void chooseProduct() {
        backpackGreenProductButton.click();
    }

    public void scrollAndClickAddToCart() {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().description(\"Tap to add product to cart\"))"
        ));
        addToCartButton.click();
    }
    public void addToCart() {
        chooseProduct();
        scrollAndClickAddToCart();
    }

    public boolean productInCart() {
        return displayNumberItemsCart.isDisplayed();
    }


}
