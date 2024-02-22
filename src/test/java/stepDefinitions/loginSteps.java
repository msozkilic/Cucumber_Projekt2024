package stepDefinitions;

import Pages.loginPage;
import Utilities.baseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginSteps {

    loginPage lp=new loginPage();
    @Given("Navigate to website")
    public void navigate_to_website() {
        WebDriver driver= baseDriver.getDriver();
        driver.get("http://zero.webappsecurity.com/");
        driver.manage().window().maximize();
    }
    @Given("Click to Sign in button")
    public void click_to_sign_in_button() {
        lp.findAndClick("signInButton");

    }
    @Given("Enter username as {string} and password as {string}")
    public void enter_username_as_and_password_as(String login11, String password2) {
        lp.findAndSend("login",login11);
        lp.findAndSend("password",password2);

    }
    @When("click login button")
    public void click_login_button() {
       lp.findAndClick("loginButton");
       lp.findAndClick("warningButton");
       lp.findAndClick("warningLink");
    }


    @Then("Verify that you are logged in.")
    public void verify_that_you_are_logged_in() {

        String expected="http://zero.webappsecurity.com/bank/account-summary.html";
        String actual=baseDriver.getDriver().getCurrentUrl();
        Assert.assertEquals(expected,actual);


    }
}
