package pages;

import core.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy (id = "com.saucelabs.mydemoapp.android:id/nameET")
    private WebElement usernameTextField;

    @AndroidFindBy (id = "com.saucelabs.mydemoapp.android:id/passwordET")
    private WebElement passwordTextField;

    @AndroidFindBy (accessibility = "Tap to login with given credentials")
    private WebElement loginButton;

    @AndroidFindBy (id = "com.saucelabs.mydemoapp.android:id/passwordErrorTV")
    private WebElement errorAllertNotification;

    public void inputUsername(String username) {
        usernameTextField.sendKeys(username);
    }

    public void inputPassword(String password) {
        passwordTextField.sendKeys(password);
    }

    public void clickBtnLogin() {
        loginButton.click();
    }

    public void login(String username, String password) {
        inputUsername(username);
        inputPassword(password);
        clickBtnLogin();
    }

    public boolean failedLoginNotification() {
        return errorAllertNotification.isDisplayed();
    }
}
