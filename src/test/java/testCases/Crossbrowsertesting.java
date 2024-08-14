package testCases;

import BaseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

    @Test
    public class Crossbrowsertesting extends BaseClass {
        public void testGoogleTitle() {
            WebDriver driver = getDriver();
            driver.get("https://www.google.com");
            String title = driver.getTitle();
            assert title.equals("Google");
        }
        @Test
        public void getEdgedriver() {
            WebDriver driver = getDriver(); // Correct way to get WebDriver instance
            driver.get("https://www.microsoft.com");
            String title = driver.getTitle();
            title.contains("Microsoft Edge");
        }
    }




