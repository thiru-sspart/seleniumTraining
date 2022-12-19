package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FirstCucumberEx {
    int c;
    @Given("I print data")
    public void printText() {
       System.out.println("Here i am printing the text");
    }

    @When("I add two integers {int} and {int}")
    public void addNumbers(int a, int b) {
         c= a+b;
    }

    @Then("vaidate sum is {int} and {string}")
    public void sumValidate(int res, String textToPrint) {
        Assert.assertEquals(res, c);
        System.out.println(textToPrint);
    }

    @Given("User login with {string} & {string}")
    public void user_login_with_multiple_users(String userName, String password) {
        page.enterUserNAme(userName);
        page.enterPassword(password);
    }
}
