package Learning.javaCode.seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumEx {
    public void test1() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiru\\Downloads\\chromedriver.exe");
        driver= new ChromeDriver();
       driver.get("https://www.google.com");
       //// navigation
//        Thread.sleep(3000);
//       driver.navigate().to("https://www.facebook.com");
//       driver.navigate().back();
//       driver.navigate().forward();

        WebElement ele= driver.findElement(By.xpath("//input[@name='q']"));
        ele.sendKeys("Selenium");


//        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@name='q'])[1]")).clear();
        Thread.sleep(3000);
      //  driver.
       driver.quit();
//       driver.close();
    }
}
