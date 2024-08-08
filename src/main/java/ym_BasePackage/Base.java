package ym_BasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {
    private WebDriver driver;
    private WebDriverWait wait;

    public void setDriver() {

        driver = WebDriverManager.chromedriver().create(); // Initializes the ChromeDriver

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }


   public WebDriver getDriver(){
      return driver;
    }

    public WebDriverWait getWait(){
        return wait;
    }

}
