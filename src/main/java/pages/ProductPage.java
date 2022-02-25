package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.DriverUtil;

public class ProductPage extends DriverUtil {

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="productTitle")
    private WebElement productTitle;

    public Boolean prouductDisplayed() {
        return productTitle.isDisplayed();
    }
}
