package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class AddMembershipSteps extends CommonMethods {

    @Given("user is logged in with admin credentials")
        public void user_is_logged_in_with_admin_credentials(){
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("My test starts here");
        sendText(ConfigReader.getPropertyValue("username"), loginPage.usernameField);
        Log.info("Username has been entered");
        sendText(ConfigReader.getPropertyValue("password"), loginPage.passwordField);
        Log.info("Password has been entered");
        click(loginPage.loginButton);


    }

    @When("admin user navigates to Qualifications")
    public void adminUserNavigatesToQualifications(){
        click(dashboardPage.AdminTabBtn);
        click(dashboardPage.qualificationsOption);
    }
    @And("admin user selects Membership")
    public void admin_user_selects_membership() {
        click(dashboardPage.membershipOption);
    }
   @And("admin user adding new {string}")
   public void admin_user_adding_new(String MembershipName) {
       click(membership.addMembershipBtn);
       sendText(MembershipName+getTimeStamp("HHmmss"),membership.MembershipNameField);
       click(membership.btnSaveMembership);

   }

    @Then("verify new membership is created")
    public void verify_new_membership_is_created() {
        String expectedMessage = "Successfully Saved";
        String actualMessage = membership.successMessage.getText();
        Assert.assertTrue("Membership has not been added", actualMessage.contains(expectedMessage));
    }



}
