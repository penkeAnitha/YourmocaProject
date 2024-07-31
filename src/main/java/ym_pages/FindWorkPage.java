package ym_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindWorkPage {
    WebDriver driver;
    WebDriverWait wait;

    public FindWorkPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

}
