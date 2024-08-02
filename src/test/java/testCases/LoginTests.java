package testCases;

import BaseTest.BaseClass;
import dataProvider_Package.LoginData;
import org.testng.Assert;
import org.testng.annotations.Test;
import ym_pages.Login;

public class LoginTests extends BaseClass {
    Login login;
//
//    @Test(dataProvider = "login data", dataProviderClass = LoginData.class)
//    public void verifyLoginwithEmail(String em, String pwd) {
//        login = new Login(getDriver(), getWait());
//        login.loginWithEmail(em,pwd);
//        Assert.assertTrue(login.isDisplayed_MyProfile());
//    }

    @Test(priority=1)
    public void verifyLoginwithEmail() {
        login = new Login(getDriver(), getWait());
        login.loginWithEmail();
        Assert.assertTrue(login.isDisplayed_MyProfile());
    }

    @Test(dependsOnMethods = {"verifyLoginwithEmail"})
    public void verifyLoginwithMobile() {
        System.out.println("disabled test method");
    }


}
