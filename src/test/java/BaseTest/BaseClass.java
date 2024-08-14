package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import ym_BasePackage.Base;
import ym_pages.Login;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class BaseClass extends Base {
//    WebDriver driver;
   /* @BeforeMethod
    public void driverSetUp() {
        setDriver();
        driver = getDriver();
        driver.get("https://dev.yourmoca.com/mocalogin");
    }

    */


    protected WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\ANITHA\\Downloads\\MicrosoftEdgeEnterpriseX64\\geckodriver.exe");
            driver = new EdgeDriver();
        }


    }


   /* @AfterMethod
    public void quitDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }

    */


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}




