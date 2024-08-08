package testCases;

import BaseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ym_pages.Castingcallpage;
import ym_pages.Login;

import java.awt.dnd.DropTargetDragEvent;


public class Castingcalltestcase extends BaseClass {
    Castingcallpage castingcallpage;

    @Test
    public void Verifycastingsearchbar() {
        castingcallpage = new Castingcallpage(getDriver(), getWait());
        Login login = new Login(getDriver(), getWait());
        login.loginWithEmail();
        castingcallpage.navigateToCastingCalls();
        Assert.assertTrue(castingcallpage.Castingcallsearchbar());
    }

    @Test
    public void Verifycastingcalfilters() {
        castingcallpage = new Castingcallpage(getDriver(), getWait());
        castingcallpage.navigateToCastingCalls();
        castingcallpage.Castingcallfilter();

    }


    @Test
    public void VerifyCastingcallfilterresult() {
        castingcallpage = new Castingcallpage(getDriver(), getWait());
        castingcallpage.navigateToCastingCalls();
        castingcallpage.selectFilterDropdown();
        String ExpectedResult = castingcallpage.selctedfilterdata ;
        Assert.assertEquals(ExpectedResult,castingcallpage.FilterResult());


    }

}







