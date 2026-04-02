package tests;

import core.BaseTest;
import core.DriverManager;
import pages.GlobalPage;
import pages.LoginPage;
import pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void successLogin() {
        GlobalPage globalPage = new GlobalPage(DriverManager.getDriver());
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        ProductPage productPage = new ProductPage(DriverManager.getDriver());

        // Go to Login page
        globalPage.clickHamburgerMenu();
        globalPage.clickLoginMenu();

        // Input Credentials and login
        loginPage.login("bod@example.com", "10203040");

        // Check Login success
        Assert.assertTrue(productPage.isProductTitlePage());
    }

    @Test
    public void failedLogin() {
        GlobalPage globalPage = new GlobalPage(DriverManager.getDriver());
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        ProductPage productPage = new ProductPage(DriverManager.getDriver());

        // Go to Login page
        globalPage.clickHamburgerMenu();
        globalPage.clickLoginMenu();

        // Input Credentials and login
        loginPage.login("alice@example.com", "10203040");

        // Check Login failed
        Assert.assertTrue(loginPage.failedLoginNotification());
    }
}
