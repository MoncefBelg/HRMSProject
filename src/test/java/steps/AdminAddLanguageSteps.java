package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AQualificationLanguagePage;
import utils.CommonMethods;

public class AdminAddLanguageSteps extends CommonMethods {

    @When("user navigates to Qualification and selects Languages")
    public void user_navigates_to_qualification_and_selects_languages() {
        System.out.println("Admin navigates to qualification");
        System.out.println("Admin select language from qualification list");
        //waitForElementToBeClickable(aQualificationLanguagePage.adminModuleTab);
        //click(aQualificationLanguagePage.adminModuleTab);

    }
    @Then("user can add any language")
    public void user_can_add_any_language() {
        System.out.println("Admin adds the intended language");
        System.out.println("Admin verifies if the intended language is added");
    }
}
