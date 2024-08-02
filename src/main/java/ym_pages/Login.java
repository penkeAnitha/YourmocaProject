package ym_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ym_BasePackage.Base;

import java.time.Duration;

public class Login extends Base {

    WebDriver driver;
    WebDriverWait wait;

    public Login(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private By emailMobileFieldLocator = By.xpath("//input[@name='email']");
    private By passwordFieldLocator = By.xpath("//input[@name='password']");
    private By loginBtnLocator = By.xpath("//span[text()='Login']");
    private By myProfileLocator = By.xpath("//*[text()=\"My Profile\"]");

    // credentials
    String mobile = "9640572111";
    String email = "anithapenke1432+filmequipment@gmail.com";
    String Password = "Krify@123";

    public void loginWithEmail() {
        WebElement email_mobileField = wait.until(ExpectedConditions.visibilityOfElementLocated(emailMobileFieldLocator));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordFieldLocator));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginBtnLocator));

        email_mobileField.sendKeys(email);
        passwordField.sendKeys(Password);
        loginBtn.click();
    }


    public void loginWithMobile(){
//        email_mobileField.sendKeys(mobile);
//        passwordField.sendKeys(Password);
//        loginBtn.click();
    }

    public void getCurrentUrl(){
        //  return driver.getCurrentUrl();
    }

    public boolean isDisplayed_MyProfile(){
        WebElement myProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(myProfileLocator));
        return myProfile.isDisplayed();
    }

}






