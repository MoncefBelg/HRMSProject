package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AQualificationLanguagePage;
import utils.CommonMethods;

public class AdminAddLanguageSteps extends CommonMethods {

    @When("user navigates to Qualification and selects Languages")
    public void user_navigates_to_qualification_and_selects_languages() {
        //System.out.println("Admin navigates to qualification");
        //System.out.println("Admin select language from qualification list");
        click(aQualificationLanguagePage.adminModuleTab);
        click(aQualificationLanguagePage.qualificationDropdown);
        click(aQualificationLanguagePage.languagesOptionList);
    }
    @Then("user can add any language")
    public void user_can_add_any_language() {
        //System.out.println("Admin adds the intended language");
        click(aQualificationLanguagePage.addLanguageButton);
        sendText("Acehnese",aQualificationLanguagePage.languageField);
        click(aQualificationLanguagePage.saveLanguageButton);
        //System.out.println("Admin verifies if the intended language is added");
    }
}
