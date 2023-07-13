package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class LoginSteps extends CommonMethods {

    @Given("admin is navigated to HRMS webpage")
    public void amin_is_navigated_to_HRMS_webpage() {
        openBrowserAndNavigateToURL();

    }

    @When("user enters admin username and password")
    public void user_enters_admin_username_and_password() {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("My test starts here");
        sendText(ConfigReader.getPropertyValue("username"), loginPage.usernameField);
        Log.info("Username has been entered");
        sendText(ConfigReader.getPropertyValue("password"), loginPage.passwordField);
        Log.info("Password has been entered");

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in_the_application() {

    }

}