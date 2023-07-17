package steps;


import utils.CommonMethods;
import utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileNotFoundException;

public class ContactDetailsChangingSteps extends CommonMethods {


    @Given("^User Navigates to HomePage$")
    public void  User_Navigates_to_HomePage() throws FileNotFoundException {
        openBrowserAndNavigateToURL();
    }
    @When("^User Enters a Username$")
    public void User_Enters_a_Username(){
        sendText(ConfigReader.getPropertyValue("username-ess"), loginPage.usernameField);

    }
    @When("^User Enters a Password$")
    public void User_Enters_a_Password(){
        sendText(ConfigReader.getPropertyValue("password-ess"), loginPage.passwordField);

    }
    @When("^User clicks on PIM$")
    public void User_clicks_on_PIM()  {
          click(employeePage.MyInfo);

    }
    @When("^User Click on Contact Details$")
    public void User_Click_on_Contact_Details(){
    click(employeePage.ContactDetails);
    }
    @When("^User Clicks on Edit Button$")
    public void User_Clicks_on_Edit_Button(){

        click(employeePage.edit);
    }

    @When("User Enters a Mobile Phone and Work Email")
    public void User_Enters_a_Mobile_Phone_and_Work_Email(){
        sendText(ConfigReader.getPropertyValue("phone"), employeePage.mobile);
        sendText(ConfigReader.getPropertyValue("email"), employeePage.workEmail);
    }

    @Then("^User Is able to Change His Contact Details And  Save it$")
    public void User_Is_able_to_Change_His_Contact_Details_And_Save_it(){
        click(employeePage.saveButton);
    }


}
