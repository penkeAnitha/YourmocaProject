package ym_pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ym_BasePackage.Base;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Castingcallpage extends Base {
    WebDriver driver;
    WebDriverWait wait;

    public Castingcallpage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private By visibilitysearchbar = By.xpath("//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"]");//
    private By castingcallfiltersCount = By.xpath(" //div[@class=\"MuiGrid-root MuiGrid-item css-14wsdbg\"]");//
    private By FilterBydropdown = By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item css-1wxaqej\"]//span[text()=\"select\"]");
    private By FiltersList = By.xpath("//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-7quhgo\"]");
    private By filterResult = By.xpath("//p[text()=\"Project Type\"]/parent::div/following-sibling::div/p[@class=\"MuiTypography-root MuiTypography-body1 content_value css-tgu552\"]");
    private By SuggestedSearchname = By.xpath(" //input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"]");
    private By Dropdown = By.xpath("//div[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf\"]//span[text()=\"Select\"]");
    private By filterlistofcategory = By.xpath("//li[@role=\"option\"]");
    private By Artistsubcategory = By.xpath("//span[@class=\"MuiChip-label MuiChip-labelMedium css-9iedg7\"]");
    private By ProfilecreatedSubcategories = By.xpath("//h5[@class=\"MuiTypography-root MuiTypography-body1 jss455 css-tgu552\"]");
    //    public String selctedfilterdata = "Ad Film";
//    public String selctedfilterData = "Ad Film";
    public String CategoryName = "Artist";

    /*   public boolean Castingcallsearchbar() {
           WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(visibilitysearchbar));
           return element.isDisplayed();
       }


       public int Castingcallfilter() {
           List<WebElement> filterslist = driver.findElements((castingcallfiltersCount));
           return filterslist.size();

       }

       public void selectFilterDropdown() {
           WebElement filterByDropdown = wait.until(ExpectedConditions.elementToBeClickable(FilterBydropdown));
           filterByDropdown.click();
           List<WebElement> filtersList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FiltersList));
           for (WebElement filterData : filtersList) {
               String FilterName = filterData.getText();
               if (FilterName.equalsIgnoreCase(selctedfilterdata)) {
                   filterData.click();
               }
           }
       }


       public String FilterResult() {
           WebElement filterResultText = wait.until(ExpectedConditions.presenceOfElementLocated(filterResult));
           String filterResultData = filterResultText.getText();
           return filterResultData;
       }


     */
    public boolean SelectedName() {
        WebElement Suggetedname = wait.until(ExpectedConditions.elementToBeClickable(SuggestedSearchname));
        Suggetedname.clear();
        Suggetedname.sendKeys("Anitha");
        Suggetedname.sendKeys(Keys.ENTER);
        return true;
    }

    public boolean Dropdownforartist() throws InterruptedException {
        SelectedName();
        WebElement elementdropdown = wait.until(ExpectedConditions.elementToBeClickable(Dropdown));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> listofcategories = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(filterlistofcategory));
        for (WebElement listsitems : listofcategories) {
            String Filternames = listsitems.getText();
            System.out.println(Filternames);
            if (Filternames.equalsIgnoreCase(CategoryName)) {
                listsitems.click();
                return true;

            }
        }
        return false;
    }

    public ArrayList<String> getAllProfileNames() {
        ArrayList<String> profileNames = new ArrayList<>();
        List<WebElement> Artistcategory = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Artistsubcategory));
        List<WebElement> Subcategoriesofartist = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ProfilecreatedSubcategories));
        for (WebElement Artistsub : Artistcategory) {
            profileNames.add(Artistsub.getText());
        }
        for (WebElement profiles : Subcategoriesofartist) {
            String profilestext = profiles.getText();
            profileNames.add(profilestext);

        }
        return profileNames;
    }


    public void NavigatetoAllCategories() {
        driver.get("https://staging.yourmoca.com/allcategories");
    }

    public void navigateToCastingCalls() {
        driver.get("https://dev.yourmoca.com/castingcalls");
    }
}















