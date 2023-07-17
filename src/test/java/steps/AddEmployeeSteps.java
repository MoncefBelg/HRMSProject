package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddEmployeeSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(dashboardPage.pimOption);
    }
    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {
        click(dashboardPage.addEmployeeButton);
    }
    @When("user enters first name and last name")
    public void user_enters_first_name_and_last_name() {
        sendText(ConfigReader.getPropertyValue("firstName"), addEmployeePage.firstNameField);
        sendText(ConfigReader.getPropertyValue("lastName"), addEmployeePage.lastNameField);
        sendText(ConfigReader.getPropertyValue("middleName"), addEmployeePage.middleNameField);
    }
//    @When("user clicks on save button")
//    public void user_clicks_on_save_button() {
//        click(addEmployeePage.saveButton);
//    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added successfully");
    }
    @When("user enters unique employee ID")
    public void user_enters_unique_employee_id() {
        sendText(ConfigReader.getPropertyValue("currentEmployeeID"), addEmployeePage.employeeID);
    }
    @When("the user submits incomplete or invalid employee info")
    public void the_user_submits_incomplete_or_invalid_employee_info() {
        sendText("", addEmployeePage.firstNameField);
        sendText("", addEmployeePage.lastNameField);
    }
    @Then("display clear and visible error message near the respective input fields")
    public void display_clear_and_visible_error_message_near_the_respective_input_fields() {
        String actualFirstNameMsg = addEmployeePage.firstNameErrorMsg.getText();
        String actualLastNameMsg = addEmployeePage.lastNameErrorMsg.getText();
        String expectedMsg = ConfigReader.getPropertyValue("expectedMsgText");

        Assert.assertEquals(expectedMsg, actualFirstNameMsg);
        Assert.assertEquals(expectedMsg, actualLastNameMsg);

    }
}
