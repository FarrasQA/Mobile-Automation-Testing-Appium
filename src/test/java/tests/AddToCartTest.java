package tests;

import core.BaseTest;
import core.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.GlobalPage;
import pages.LoginPage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {
    @Test
    public void successAddProductToCart() {
        GlobalPage globalPage = new GlobalPage(DriverManager.getDriver());
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        ProductPage productPage = new ProductPage(DriverManager.getDriver());
        AddToCartPage addToCartPage = new AddToCartPage(DriverManager.getDriver());

        // Go to Login page
        globalPage.clickHamburgerMenu();
        globalPage.clickLoginMenu();

        // Input Credentials and login
        loginPage.login("bod@example.com", "10203040");

        // Check Login success
        Assert.assertTrue(productPage.isProductTitlePage());

        //Add product to cart
        addToCartPage.addToCart();

        //Check add to cart success
        addToCartPage.productInCart();

    }
}