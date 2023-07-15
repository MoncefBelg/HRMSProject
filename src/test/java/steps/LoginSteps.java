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
        System.out.println("The user has logged in successfully");
    }

    @Then("error message is displayed")
    public void error_message_is_displayed() {

    }

    @When("user enters {string} and {string} and verifying the {string} for the combinations")
    public void user_enters_and_and_verifying_the_for_the_combinations
            (String username, String password, String errorMessageExpected) {
        sendText(username, loginPage.usernameField);
        sendText(password, loginPage.passwordField);
        click(loginPage.loginButton);
        String errorMessageActual = loginPage.errorMessageField.getText();

    }

}