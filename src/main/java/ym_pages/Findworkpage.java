package ym_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import ym_BasePackage.Base;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Findworkpage extends Base {
    WebDriver driver;
    WebDriverWait wait;

    public Findworkpage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    private By findworksearch = By.xpath("//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-adornedEnd css-1oh6la\"]");
    private By dropdownfilter = By.xpath("//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall  css-17pbo7j\"]//span[text()=\"Select Budget\"]");
    private By selectedfilterbudget = By.xpath("//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-7quhgo\"] [text()=\"0-10000\"]");
    private By selectedremenurationbudget = By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item budget css-1wxaqej\"]");

    public boolean findworksearchbar() {
        WebElement findworksearchvisibility = wait.until(ExpectedConditions.visibilityOfElementLocated(findworksearch));
        return findworksearchvisibility.isDisplayed();
    }


    public void dropdownfilter() {
        WebElement Dropdownfilter = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownfilter));
        Dropdownfilter.click();
    }

    public boolean selectedfilterbudget() {
        WebElement elementselectedfilter = wait.until(ExpectedConditions.visibilityOfElementLocated(selectedfilterbudget));
        String actualBudgetText = elementselectedfilter.getText();
        elementselectedfilter.click();
        String[] budgetRange = actualBudgetText.replaceAll("[^0-9-]", "").split("-");
        int actualBudgetMin = Integer.parseInt(budgetRange[0]);
        System.out.println(actualBudgetMin);
        int actualBudgetMax = Integer.parseInt(budgetRange[1]);
        System.out.println(actualBudgetMax);
        WebElement RemunerationAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(selectedremenurationbudget));
        String actualBudget = RemunerationAmount.getText();
        String RequestAmount = actualBudget.replaceAll("[^0-9]", "");
        int Remuneration = Integer.parseInt(RequestAmount);
        System.out.println(Remuneration);
        if (Remuneration >= actualBudgetMin && Remuneration <= actualBudgetMax) {
            System.out.println("The actual budget is within the selected budget range.");
            return true;
        } else {
            System.out.println("The actual budget is not within the selected budget range.");
        }
        return false;
    }

    public void selectedremenurationprice() {
        WebElement remunarationbudget = wait.until(ExpectedConditions.visibilityOfElementLocated(selectedremenurationbudget));

    }

    public void navigatetofindworkpage() {
        driver.get("https://dev.yourmoca.com/findwork");
    }

}

