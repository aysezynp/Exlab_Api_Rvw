package api.exlab.pages;


import api.exlab.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//li[contains(@class,'nav-item dropdown')]")
    public List<WebElement> upTitles;

    @FindBy(css = "[class='d-none d-md-block dropdown-toggle ps-2']")
    public WebElement userAccountName;

    public void navigateToModule(String menu){
        String locator = "//span[.='" + menu + "']";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    //method OVERLOADING
    public void navigateToModule(String tab, String module) throws InterruptedException {
        String locator = "//span[.='" + tab + "']";
        String locator2 = "//span[.='" + module + "']";

        Thread.sleep(2000);
        WebElement tabElement=Driver.get().findElement(By.xpath(locator));
        tabElement.click();
        Thread.sleep(2000);
        WebElement moduleElement = Driver.get().findElement(By.xpath(locator2));
        moduleElement.click();

    }

    public String getUserAccountName(){
        return userAccountName.getText();
    }
}
