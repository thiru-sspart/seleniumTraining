package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import utils.DriverUtil;

public class AmazonStepDefs {

    HomePage home= new HomePage();

    @Given("I launch the url")
    public void launchingUrl() {
     home.launchUrl();
    }

    @Then("i validate th logo is diplayed")
    public void logo() {
        Assert.assertTrue(home.logoDisplayed());
    }

    @When("I enter the {string} in serach box")
    public void i_enter_the_in_serach_box(String data1) {
        home.enterTextInSearch(data1);

    }

    @When("I click on search Button")
    public void i_click_on_search_button() {
        home.clickSearchButton();
        System.out.println("Hiii");
    }

    @Given("I launch the driver")
    public void launchDrievring() {

        DriverUtil.launchDriver();
    }

    @Then("I quit the browser")
    public void thequitBrowser() {
        home.quitBrowser();
    }
}
