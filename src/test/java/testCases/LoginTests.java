package testCases;

import BaseTest.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ym_BasePackage.Base;
import ym_pages.Login;

public class LoginTests extends BaseClass {
    Login login;

    @Test
    public void verifyLoginwithEmail() {
        login = new Login(getDriver(), getWait());
        login.loginWithEmail();
        Assert.assertTrue(login.isDisplayed_MyProfile());
    }

    @Test
    public void verifyLoginwithMobile() {

    }


    @Test
    public void verifysearchfield() {
        navigateToCastingCalls();
        login = new Login(getDriver(), getWait());
        login.searchview();
        Assert.assertTrue(login.searchview());
    }

    @Test
    public void VerifycastingCallFilters() {
        navigateToCastingCalls();
        login = new Login(getDriver(), getWait());
        login.searchview();
        login.castingcallfilters();

    }

    @Test
    public void verifycastingcallselectedfilter() {
        navigateToCastingCalls();
        login = new Login(getDriver(), getWait());
        login.selectedprojecttype();
    }


}
