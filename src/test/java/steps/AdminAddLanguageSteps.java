package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import pages.AQualificationLanguagePage;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class AdminAddLanguageSteps extends CommonMethods {

    @When("user navigates to Qualification and selects Languages")
    public void user_navigates_to_qualification_and_selects_languages() {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("Start test case for Admin Add Language");
        //System.out.println("Admin select language from qualification list");
        click(aQualificationLanguagePage.adminModuleTab);
        Log.info("Admin navigates to Admin module");
        click(aQualificationLanguagePage.qualificationDropdown);
        Log.info("Admin navigates to Qualifications menu");
        click(aQualificationLanguagePage.languagesOptionList);
        Log.info("Admin navigates to Language page");
    }
    @Then("user can add any language")
    public void user_can_add_any_language() {
        click(aQualificationLanguagePage.addLanguageButton);
        Log.info("Admin clicks on add language button");
        sendText(ConfigReader.getPropertyValue("language"),aQualificationLanguagePage.languageField);
        Log.info("Admin enters the intended language in language name field");
        click(aQualificationLanguagePage.saveLanguageButton);
        Log.info("Admin clicks on save button");
        Log.endTestCase("The end of test case for Admin Add Language");
    }
}
