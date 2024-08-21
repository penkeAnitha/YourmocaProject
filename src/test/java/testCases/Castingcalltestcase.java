package testCases;

import BaseTest.BaseClass;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ym_pages.Castingcallpage;
import ym_pages.Findworkpage;
import ym_pages.Login;

import java.awt.dnd.DropTargetDragEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Castingcalltestcase extends BaseClass {
    Castingcallpage castingcallpage;

  /*  @Test
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
        String ExpectedResult = castingcallpage.selctedfilterdata;
        Assert.assertEquals(ExpectedResult, castingcallpage.FilterResult());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();

    }

   */

    @Test
    public void VerifyDropdownfilterArtist() throws InterruptedException{
        Login login = new Login(getDriver(), getWait());
        login.loginWithEmail();
        Castingcallpage castingcallpage = new Castingcallpage(getDriver(), getWait());
        castingcallpage.NavigatetoAllCategories();
        String Expectesresult = castingcallpage.CategoryName;
       Assert.assertEquals(Expectesresult,castingcallpage.Dropdownforartist());

        // Assert the actual result

        /*String[] Expectedfilters = {" ", "Male Model", "Influencer", "Actress", "Female Model"};
        List<String> expectedFiltersfromArray = Arrays.asList(Expectedfilters);
        ArrayList<String> Listfromweb = castingcallpage.getAllProfileNames();
        Assert.assertTrue(expectedFiltersfromArray.equals(Listfromweb));
        System.out.println("expectedResult" + expectedFiltersfromArray);
        System.out.println("listfromweb" + Listfromweb);
        System.out.println("Artist filters passed");
        Assert.assertFalse(expectedFiltersfromArray.equals(Listfromweb));
        System.out.println("expectedResult" + expectedFiltersfromArray);
        System.out.println("listfromweb" + Listfromweb);
        System.out.println("Artist filters not passed");
    }

         */

    }
}







