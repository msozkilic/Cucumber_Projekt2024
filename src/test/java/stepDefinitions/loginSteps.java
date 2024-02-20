package stepDefinitions;

import Pages.loginPage;
import Utilities.baseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

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

    }
    @Given("Enter username as {string} and password as {string}")
    public void enter_username_as_and_password_as(String string, String string2) {

    }
    @When("click login button")
    public void click_login_button() {
        System.out.println("calisti");
    }
    @Then("Verify that you are logged in.")
    public void verify_that_you_are_logged_in() {
        System.out.println("calisti");
    }
}
