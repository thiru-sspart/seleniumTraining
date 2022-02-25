package testNgTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.DriverUtil;

public class AmazonHomePageTestcase {

    @Test
    public void test1() {
        HomePage home= new HomePage();
        home.launchUrl();
        Assert.assertTrue(home.logoDisplayed());
        home.enterTextInSearch("Samasung");
        home.clickSearchButton();

    }
}
