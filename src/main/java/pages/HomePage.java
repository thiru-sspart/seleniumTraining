package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtil;
import utils.ResourceUtil;

public class HomePage extends DriverUtil {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id= "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(id="nav-search-submit-button")
    private WebElement serachButton;

    @FindBy(id="nav-logo-sprites")
    private WebElement amazonLogoText;

    public void launchUrl() {
        driver.get(ResourceUtil.getProperty("baseUrl"));
    }

    public void enterTextInSearch(String text) {
        searchBox.sendKeys(text);
    }

    public void quitBrowser() {
        driver.quit();
    }

    public void clickSearchButton() {
        serachButton.click();
    }

    public Boolean logoDisplayed() {
        return amazonLogoText.isDisplayed();
//        return  false;
    }

}
