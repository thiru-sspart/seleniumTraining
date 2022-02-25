package Learning.javaCode.seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEx {
    public void test1() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiru\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Select select = new Select(driver.findElement(By.id("searchDropdownBox")));
        select.selectByIndex(1);
        select.selectByVisibleText("Baby");
        select.selectByValue("search-alias=fashion-boys-intl-ship");

        //Second dropdown
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
        driver.findElement(By.xpath("//ul/li/a/div[text()='Amazon Music']")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
