package ym_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ym_BasePackage.Base;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class Findworkpage extends Base {
    WebDriver driver;
    WebDriverWait wait;

    public Findworkpage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private By findworksearch = By.xpath("//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-adornedEnd css-1oh6la\"]");
    private By findworklist = By.xpath(" //p[@class=\"MuiTypography-root MuiTypography-body1 css-tc9djq\"]");
    private By findworkfilterslist = By.xpath("//li[@role=\"option\"]");
    private By ClickDropdown = By.xpath("//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall  css-17pbo7j\"]//span[text()=\"Select Budget\"]");
    //div[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf\"][@aria-controls=\":r1hv:\"]");//
    private  By selectedremenurationbudget = By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item budget css-1wxaqej\"]");
    public String Budgetfilterdata = "0-10000";

    public boolean findworksearchbar() {
        WebElement findworksearchvisibility = wait.until(ExpectedConditions.visibilityOfElementLocated(findworksearch));
        return findworksearchvisibility.isDisplayed();
    }

    public int FIndworkfilternames() {
        List<WebElement> filterslist = driver.findElements((findworklist));
        return filterslist.size();

    }

    public void Dropdown() {
        WebElement Dropdownfilter = wait.until(ExpectedConditions.elementToBeClickable(ClickDropdown));
        Dropdownfilter.click();
        List<WebElement> filterlists = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(findworkfilterslist));
        for (WebElement filters : filterlists) {
            String filtername = filters.getText();
            System.out.println(filtername);
            if (filtername.equalsIgnoreCase(Budgetfilterdata)) {
                filters.click();
            }
        }
    }


    public boolean selectedfilterbudget() {
        Dropdown();
        String[] budgetRange = Budgetfilterdata.replaceAll("[^0-9-]", "").split("-");
        int actualBudgetMin = Integer.parseInt(budgetRange[0]);
        System.out.println(actualBudgetMin);
        int actualBudgetMax = Integer.parseInt(budgetRange[1]);
        System.out.println(actualBudgetMax);

        //Requests list after applying the budget filter
        List<WebElement> RemunerationAmount = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectedremenurationbudget));
        for (WebElement Budgets : RemunerationAmount){
            String actualBudget = Budgets.getText();
            String RequestAmount = actualBudget.replaceAll("[^0-9]", "");
            int Remuneration = Integer.parseInt(RequestAmount);
            System.out.println("work request remuneration: "+Remuneration);
            if (Remuneration < actualBudgetMin && Remuneration > actualBudgetMax) {
                System.out.println("The actual budget is not within the selected budget range.");
                return false;
            }
        }
        return true;
    }

    public void selectedremenurationprice() {
        WebElement remunarationbudget = wait.until(ExpectedConditions.visibilityOfElementLocated(selectedremenurationbudget));

    }

    public void navigatetofindworkpage() {
        driver.get("https://dev.yourmoca.com/findwork");
    }
}










