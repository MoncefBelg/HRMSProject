package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import pages.AddMembershipDetailsPage;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class AddMembershipDetailsSteps extends CommonMethods {

    @When("user enters employee username and password")
    public void user_enters_employee_username_and_password() {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("My test starts here");
        sendText(ConfigReader.getPropertyValue("employeeUserName"), loginPage.usernameField);
        sendText(ConfigReader.getPropertyValue("employeePassword"), loginPage.passwordField);
    }
    @Then("user clicks on MyInfo option")
    public void user_clicks_on_my_info_option() {
       click(addMembershipDetailsPage.myInfoButton);
    }
    @Then("user clicks on Memberships option")
    public void user_clicks_on_memberships_option() {
        click(addMembershipDetailsPage.membershipsOpt);
    }
    @Then("user clicks on add button")
    public void user_clicks_on_add_button() {
       click(addMembershipDetailsPage.addButton);
    }
    @Then("user select the Membership")
    public void user_select_the_membership() {
       singleSelectFromDropdownsUsingText(ConfigReader.getPropertyValue("Membership"), addMembershipDetailsPage.Membership);
    }
    @Then("user select the Subscription Paid By")
    public void user_select_the_subscription_paid_by() {
        singleSelectFromDropdownsUsingText(ConfigReader.getPropertyValue("subscriptionPaidBy"), addMembershipDetailsPage.subscriptionPaidBy);
    }
    @Then("user enters the Subscription Amount")
    public void user_enters_the_subscription_amount() {
       sendText(ConfigReader.getPropertyValue("subscriptionAmount"), addMembershipDetailsPage.membershipSubscriptionAmount);
    }
    @Then("user select the Currency")
    public void user_select_the_currency() {
       singleSelectFromDropdownsUsingText(ConfigReader.getPropertyValue("currency"), addMembershipDetailsPage.membershipCurrency);
    }
    @Then("user select Subscription Commence Date")
    public void user_select_subscription_commence_date() {
        click(addMembershipDetailsPage.subscriptionCommenceDateCalendar);
        calendarSelectDate(addMembershipDetailsPage.subscriptionCommenceDateMonth, ConfigReader.getPropertyValue("subscriptionCommenceDateMonth"),
                addMembershipDetailsPage.subscriptionCommenceDateYear, ConfigReader.getPropertyValue("subscriptionCommenceDateYear"),
                addMembershipDetailsPage.subscriptionCommenceDateDay, ConfigReader.getPropertyValue("subscriptionCommenceDateDay"));
    }
    @Then("user select Subscription Renewal Date")
    public void user_select_subscription_renewal_date() {
        click(addMembershipDetailsPage.subscriptionRenewalDateCalendar);
        calendarSelectDate(addMembershipDetailsPage.subscriptionRenewalDateMonth, ConfigReader.getPropertyValue("subscriptionRenewalDateMonth"),
                addMembershipDetailsPage.subscriptionRenewalDateYear, ConfigReader.getPropertyValue("subscriptionRenewalDateYear"),
                addMembershipDetailsPage.subscriptionRenewalDateDay, ConfigReader.getPropertyValue("subscriptionRenewalDateDay"));
    }
    @Then("user can see employee information")
    public void user_can_see_employee_information() {
        addMembershipDetailsPage.Membership.isSelected();
        addMembershipDetailsPage.subscriptionPaidBy.isSelected();
        addMembershipDetailsPage.membershipSubscriptionAmount.isDisplayed();
        addMembershipDetailsPage.membershipCurrency.isSelected();
        addMembershipDetailsPage.membershipCurrency.isSelected();
        addMembershipDetailsPage.subscriptionCommenceDateCalendar.isDisplayed();
        addMembershipDetailsPage.subscriptionRenewalDateCalendar.isDisplayed();
    }
    @Then("user clicks on Save button")
    public void user_clicks_on_save_button() {
        click(addMembershipDetailsPage.btnSaveMembership);
    }
    @Then("employee membership details added successfully")
    public void employee_membership_details_added_successfully() {
        waitForElementToBePresent(addMembershipDetailsPage.msgSuccess, "Successfully Saved" );
        Log.endTestCase("My test ends here");
    }
}
