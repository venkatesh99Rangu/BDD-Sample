package Stepdefination;

import Pageobjects.LoginPage;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class steps {
    public WebDriver driver;
    public LoginPage lp;

    @Given("User Lunch Chrome Browser")
    public void user_lunch_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        /*System.setProperty("webdriver.chrome.driver",System.setProperty(W)/home/thrym2/IdeaProjects/WMS_AUTOMATION/Drivers/chromedriver (1));*/
        System.setProperty("webdriver.chrome.driver","./home/thrym2/Downloads/chromedriver (2)");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        lp=new LoginPage(driver);
       // throw new io.cucumber.java.PendingException();
    }

    @When("User Opens URL {string}")
    public void user_opens_url(String URL) {
        // Write code here that turns the phrase above into concrete actions

        driver.get(URL);
        //throw new io.cucumber.java.PendingException();
    }

    @When("User enters loginid as {string} and Password as {string}")
    public void user_enters_loginid_as_and_password_as(String LoginId, String Password) {
        // Write code here that turns the phrase above into concrete actions

        lp.enterloginid(LoginId);
        lp.enterPassword(Password);

    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
       lp.submit();
    }

    @Then("User Should get the {string}")
    public void user_should_get_the(String title) {
        // Write code here that turns the phrase above into concrete actions
     if (driver.getPageSource().contains("Abdul Latif Jameel")){
         Assert.assertEquals(title,driver.getTitle());

          }else {

         driver.close();
         Assert.assertTrue(false);

     }


    }

    @When("Close the Browser")
    public void close_the_browser() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
       driver.close();
    }
}
