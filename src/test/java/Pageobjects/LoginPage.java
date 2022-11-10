package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //initialisation
    public LoginPage(WebDriver driver)
    {

        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "email")
    WebElement Login;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement Submit_bttn;



    //Utilisation
    public void enterloginid(String loginId)
    {
           Login.sendKeys(loginId);
    }
    public void enterPassword(String password)
    {
       Password.sendKeys(password);
    }
    public void submit()
    {
        Submit_bttn.click();
    }
}
