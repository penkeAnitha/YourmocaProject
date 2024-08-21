package testCases;

import BaseTest.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Microsoftedge extends BaseClass {
    @Test
    public void VerifyMicrosoftedge() {
        driver.get("https://www.microsoft.com");
        String microsoftTitle = driver.getTitle();
        Assert.assertTrue(microsoftTitle.contains("Microsoft"), "Title should contain Microsoft");
    }
}
