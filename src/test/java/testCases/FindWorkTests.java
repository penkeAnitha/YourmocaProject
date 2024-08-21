package testCases;

import BaseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ym_pages.Castingcallpage;
import ym_pages.Findworkpage;
import ym_pages.Login;

public class FindWorkTests extends BaseClass {
    @Test//(priority = 2)
    public void Verifyfindworksearchbar() {
        Login login = new Login(getDriver(), getWait());
        login.loginWithEmail();
        Findworkpage findworkpage = new Findworkpage(getDriver(), getWait());
        findworkpage.navigatetofindworkpage();
        Assert.assertTrue(findworkpage.findworksearchbar());
    }

    @Test
    public void Verifyfindworkfilternames() {
        Findworkpage findworkpage = new Findworkpage(getDriver(), getWait());
        findworkpage.navigatetofindworkpage();
        findworkpage.FIndworkfilternames();
    }

    @Test//(priority = 1)
    public void Verifyselectedfindworkfilter(){
        Login login = new Login(getDriver(), getWait());
        login.loginWithEmail();
        login.isDisplayed_MyProfile();
        login.loginWithEmail();
        Findworkpage findworkpage = new Findworkpage(getDriver(), getWait());
        findworkpage.navigatetofindworkpage();
        Assert.assertTrue(findworkpage.selectedfilterbudget());
    }


    @Test//(priority=3)
    public void Verifyremunarationprice(){
        Findworkpage findworkpage = new Findworkpage(getDriver(), getWait());
        findworkpage.navigatetofindworkpage();
        findworkpage.selectedremenurationprice();
    }

}
