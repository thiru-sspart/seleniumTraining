package Learning.javaCode.seleniumCode;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupsEx {


    public static void main(String args[]) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiru\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
//        driver.get("https://demo.guru99.com/test/delete_customer.php");
//
//        driver.findElement(By.name("submit")).click();
//        Alert alert= driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//        driver.switchTo().alert().accept();
//        Thread.sleep(3000);

        driver.get("https://www.google.com");
        WebElement ele= driver.findElement(By.xpath("//input[@name='q']"));

        Actions action = new Actions(driver);
        action.moveToElement(ele).
                keyDown(ele, Keys.SHIFT)
                .sendKeys(ele, "selenium")
                .keyUp(ele, Keys.SHIFT).build().perform();
        Thread.sleep(3000);
        driver.quit();

    }
}
