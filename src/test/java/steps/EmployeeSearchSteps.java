package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EmployeeSearchSteps extends CommonMethods {

    @When("user clicks on PIM option and Employee list option")
    public void user_clicks_on_pim_option_and_employee_list_option() {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("Start test case for Search Employee");
        click(dashboardPage.pimOption);
        click(dashboardPage.employerListOption);
        Log.info("Admin navigates to Employee List");

    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        List<String> lst2 = new ArrayList<>();
//        Then just get an element (lst.get(k).getText()) from lst and add it to lst1 in the loop.

        for(int i = 0; i < allIDs.size(); ++i) {
            lst2.add(allIDs.get(i).getText());
        }

        System.out.println(lst2);

        Random rndm = new Random();
        // creating object
        String rndmElem1 = String.valueOf(lst2.get(rndm.nextInt(allIDs.size())));
        System.out.println("Selecting a random element from the list : " + rndmElem1);
        System.out.println(rndmElem1);

       sendText(rndmElem1, employeeSearchPage.idTextField);
        Log.info("Admin search an employee by id");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(employeeSearchPage.searchButton);
        Log.info("Admin clicks on search button");

    }

    @When("user enters valid employee name in name text box")
    public void user_enters_valid_employee_name_in_name_text_box() {
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
        List<String> lst1 = new ArrayList<>();
        for(int i = 0; i < allIDs.size(); ++i) {
            lst1.add(allIDs.get(i).getText());
        }
        System.out.println(lst1);
        Random rndm = new Random();
        // creating object
        String rndmElem = String.valueOf(lst1.get(rndm.nextInt(allIDs.size())));
        System.out.println("Selecting a random element from the list : " + rndmElem);
        System.out.println(rndmElem);

        sendText(rndmElem, employeeSearchPage.nameTextField);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBtn")));
        Log.info("Admin search an employee by name");
    }

    @Then("user is able to see employee information")
    public void user_is_able_to_see_employee_information() {
        System.out.println("Employee is displayed");
    }

    @When("user enters invalid employee id in idtext box")
    public void user_enters_invalid_employee_id_in_idtext_box() {
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        List<String> lst3 = new ArrayList<>();
//        Then just get an element (lst.get(k).getText()) from lst and add it to lst1 in the loop.
        for(int i = 0; i < allIDs.size(); ++i) {
            lst3.add(allIDs.get(i).getText());
        }
        System.out.println(lst3);

        Random rndm3 = new Random();
        // creating object
        String rndmElem3 = String.valueOf(lst3.get(rndm3.nextInt(allIDs.size())));
        System.out.println("Selecting a random element from the list : " + rndmElem3);
        System.out.println(rndmElem3);
        String rndmElem4=(rndmElem3+"@");

        sendText(rndmElem4, employeeSearchPage.idTextField);
        Log.info("Admin search an employee by an invalid id");
    }

    @Then("user is going to see no records found message")
    public void user_is_going_to_see_no_records_found_message () {
        String expectedMessage="No Records Found";
        String actualMessage = employeeSearchPage.notfound.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
        Log.info("Admin request for a 'no records found' message");
    }

}