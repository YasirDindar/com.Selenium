package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {
    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement loginPortalButonu;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement userNameKutusu;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement passwordKutusu;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButonu;
}
