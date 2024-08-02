package ym_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ym_BasePackage.Base;

import java.util.List;

public class Castingcallpage extends Base {
    WebDriver driver;
    WebDriverWait wait;

    public Castingcallpage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private By visibilitysearchbar = By.xpath("//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"]");
    private By castingcallfiltersCount = By.xpath(" //div[@class=\"MuiGrid-root MuiGrid-item css-14wsdbg\"]");
    private By FilterBydropdown = By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item css-1wxaqej\"]//span[text()=\"select\"]");
    private By FiltersList = By.xpath("//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-7quhgo\"]");
    private By castingcallfilterresult = By.id("Corporate Video");
    private By filterResult = By.xpath("//p[text()=\"Project Type\"]/parent::div/following-sibling::div/p[@class=\"MuiTypography-root MuiTypography-body1 content_value css-tgu552\"]");

   public String selectFilterData = "Corporate Video";

    public boolean Castingcallsearchbar() {
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
        for(WebElement filterData : filtersList ){
           String FilterName = filterData.getText();
           if(FilterName.equalsIgnoreCase(selectFilterData)){
               filterData.click();
           }
       }
    }

    public String FilterResult(){
        WebElement filterResultText = wait.until(ExpectedConditions.presenceOfElementLocated(filterResult));
        String filterResultData = filterResultText.getText();
        return filterResultData;
    }

    public void navigateToCastingCalls() {
        driver.get("https://dev.yourmoca.com/castingcalls");
        

    }


}



