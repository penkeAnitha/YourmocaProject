package testCases;

import BaseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Crossbrowsertesting extends BaseClass {
    @Test
    public void testGoogleTitle() {
        WebDriver driver = getDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        assert title.equals("Google");
    }
    //Correct way to get WebDriver instance
}





