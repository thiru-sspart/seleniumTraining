package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {

    public static WebDriver driver;

    public static void launchDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiru\\Downloads\\chromedriver.exe");
        driver= new ChromeDriver();
    }

}
