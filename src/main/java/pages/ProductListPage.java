package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtil;

public class ProductListPage extends DriverUtil {

    public ProductListPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Apple iPhone 11 Pro, 256GB, Space Gray - Fully Unlocked (Renewed Premium)']")
    private WebElement productText;

    public void clickProduct() {
        productText.click();
    }


}
