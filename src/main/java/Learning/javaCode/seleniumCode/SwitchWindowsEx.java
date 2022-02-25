package Learning.javaCode.seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchWindowsEx {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiru\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");

        //Switch windows
        String parent= driver.getWindowHandle();
        driver.findElement(By.xpath("//div[text()='Register']")).click();
        Set<String> handles= driver.getWindowHandles();

        System.out.println(handles);
        for(String s: handles) {
            driver.switchTo().window(s);
            Thread.sleep(5000);
            if(driver.getCurrentUrl().contains("https://www.naukri.com/registration/createAccount?")){
                driver.findElement(By.xpath("//input[@placeholder='What is your name?']")).sendKeys("Thiru");
                driver.close();
                Thread.sleep(2000);
            }
        }
        driver.switchTo().window(parent);
        driver.quit();





    }
}
