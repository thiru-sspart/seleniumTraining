package Learning.javaCode.seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsEx {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiru\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        Thread.sleep(3000);
        List<WebElement> li= driver.findElements(By.xpath("//table/tbody/tr/td[1]/a"));
        for(int i=0; i<li.size(); i++) {
           System.out.println(li.get(i).getText());
        }
        driver.quit();

        //dropdown
        //alerts
        //switch windows
        //frames
        //waits
        //actions

    }
}
