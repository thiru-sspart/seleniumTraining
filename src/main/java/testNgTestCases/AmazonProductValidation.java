package testNgTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductListPage;
import pages.ProductPage;
import utils.DriverUtil;

public class AmazonProductValidation {



    @Test
    public void test2() {
        HomePage home= new HomePage();
        ProductListPage productListPage = new ProductListPage();
        ProductPage productPage = new ProductPage();
        home.launchUrl();
        home.enterTextInSearch("Apple iPhone 11 Pro, 256GB, Space Gray - Fully Unlocked (Renewed Premium)");
        home.clickSearchButton();
        productListPage.clickProduct();
        Assert.assertTrue(productPage.prouductDisplayed());

    }
}
