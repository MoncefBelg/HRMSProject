package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Constants;
import utils.Log;

public class AddEmployeeJobDetailsSteps extends CommonMethods {

    @Then("user enters valid employee ID in textBox")
    public void user_enters_valid_employee_id_in_text_box() {
        sendText(ConfigReader.getPropertyValue("employeeID"), employeeSearchPage.idTextField);
    }

    @When("user clicks on employee information table")
    public void user_clicks_on_employee_information_table() {
       click(employeeSearchPage.IDTable);
    }
    @When("user clicks on job button and edit button")
    public void user_clicks_on_job_button_and_edit_button() {
      click(personalPage.personalDetailJob);
      click(addEmployeeJobDetailsPage.editBtn);
    }
    @Then("user select the job title")
    public void user_select_the_job_title() {
        singleSelectFromDropdownsUsingText(ConfigReader.getPropertyValue("jobTitle"), addEmployeeJobDetailsPage.jobTitle);
    }
    @Then("user select the employment status")
    public void user_select_the_employment_status() throws InterruptedException {
       singleSelectFromDropdownsUsingText(ConfigReader.getPropertyValue("employmentStatus"), addEmployeeJobDetailsPage.employmentStatus);

    }
    @Then("user select the joined date")
    public void user_select_the_joined_date() throws InterruptedException {
          click(addEmployeeJobDetailsPage.joinedDateCalendar);
          calendarSelectDate(addEmployeeJobDetailsPage.joinedDateMonth, ConfigReader.getPropertyValue("joinedDateMonth"),
                  addEmployeeJobDetailsPage.joinedDateYear, ConfigReader.getPropertyValue("joinedDateYear"),
                  addEmployeeJobDetailsPage.joinedDateAllDays, ConfigReader.getPropertyValue("joinedDateDay"));

    }
    @Then("user select the sub unit")
    public void user_select_the_sub_unit() throws InterruptedException {
        singleSelectFromDropdownsUsingText(ConfigReader.getPropertyValue("subUnit"), addEmployeeJobDetailsPage.subUnit);

    }
    @Then("user select the location")
    public void user_select_the_location() throws InterruptedException {
         singleSelectFromDropdownsUsingText(ConfigReader.getPropertyValue("location"), addEmployeeJobDetailsPage.location);

    }
    @Then("user select start date of a employment contract")
    public void user_select_start_date_of_a_employment_contract() throws InterruptedException {
       click(addEmployeeJobDetailsPage.startDateContractCalendar);
       calendarSelectDate(addEmployeeJobDetailsPage.startDateContractMonth, ConfigReader.getPropertyValue("startDateMonth"),
               addEmployeeJobDetailsPage.startDateContractYear, ConfigReader.getPropertyValue("startDateYear"),
               addEmployeeJobDetailsPage.startDateContractAllDays, ConfigReader.getPropertyValue("startDateDay"));

    }
    @Then("user select end date of a employment contract")
    public void user_select_end_date_of_a_employment_contract() throws InterruptedException {
        click(addEmployeeJobDetailsPage.endDateContractCalendar);
        calendarSelectDate(addEmployeeJobDetailsPage.endDateContractMonth, ConfigReader.getPropertyValue("endDateMonth"),
                addEmployeeJobDetailsPage.endDateContractYear, ConfigReader.getPropertyValue("endDateYear"),
                addEmployeeJobDetailsPage.endDateContractAllDays, ConfigReader.getPropertyValue("endDateDay"));

    }
    @Then("user add contract details")
    public void user_add_contract_details() throws InterruptedException {
       fileUpload(addEmployeeJobDetailsPage.chooseFile, Constants.CONTRACT_DETAILS);
       checkBox(addEmployeeJobDetailsPage.allCheckBox, ConfigReader.getPropertyValue("contractDetails"));
    }
    @Then("user is able to see the employee information")
    public void user_is_able_to_see_the_employee_information() {
        addEmployeeJobDetailsPage.jobTitle.isSelected();
        addEmployeeJobDetailsPage.employmentStatus.isSelected();
        addEmployeeJobDetailsPage.joinedDateCalendar.isDisplayed();
        addEmployeeJobDetailsPage.subUnit.isSelected();
        addEmployeeJobDetailsPage.location.isSelected();
        addEmployeeJobDetailsPage.startDateContractCalendar.isDisplayed();
        addEmployeeJobDetailsPage.endDateContractCalendar.isDisplayed();
        addEmployeeJobDetailsPage.chooseFile.isDisplayed();
    }
    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
     click(addEmployeeJobDetailsPage.saveBtn);

    }
    @Then("job details added successfully")
    public void job_details_added_successfully() {
       waitForElementToBePresent(addEmployeeJobDetailsPage.message, "Successfully Updated" );
       Log.endTestCase("My test ends here");
    }
}
