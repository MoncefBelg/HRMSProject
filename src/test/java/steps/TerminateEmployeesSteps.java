package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class TerminateEmployeesSteps extends CommonMethods {

    @When("user accesses the list of employees in the system")
    public void user_accesses_the_list_of_employees_in_the_system()  {
        click(terminateEmployees.pimOption);
        click(terminateEmployees.empList);
    }

    @When("select a specified employee from the list")
    public void select_a_specified_employee_from_the_list() {
        sendText(ConfigReader.getPropertyValue("terminateEmployeeId"), terminateEmployees.empSearchField);
        click(terminateEmployees.empSearchBtn);
        click(terminateEmployees.empSearchResult);
    }

    @When("navigate to the employee's job page")
    public void navigate_to_the_employee_s_job_page() {
        click(terminateEmployees.jobBtn);

    }

    @When("select the option to terminate the employment of the specified employee")
    public void select_the_option_to_terminate_the_employment_of_the_specified_employee() {
        click(terminateEmployees.terminateBtn);
        click(terminateEmployees.terminationConfirm);
    }


    @Then("specified employee is terminated")
    public void specified_employee_is_terminated() {

        String expectedMessage = "Terminated on : " + getTimeStamp("YYYY-MM-dd");
        String actualMsg = terminateEmployees.confirmationMessage.getText();
        Assert.assertEquals(expectedMessage, actualMsg);
    }
}
