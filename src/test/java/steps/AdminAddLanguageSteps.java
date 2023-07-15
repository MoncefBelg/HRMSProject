package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AQualificationLanguagePage;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

import java.util.List;

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

        List<WebElement> allLanguages =
                driver.findElements(By.xpath("//*[@id='recordsListTable']/tbody/tr/td[2]"));

        String expectMsg="";
        for(int i=0;i<allLanguages.size();i++){
            String language = allLanguages.get(i).getText();

            if(language.equals(ConfigReader.getPropertyValue("language"))){
                System.out.println("<<<<<The language is added>>>>");
                System.out.println("==============================");
                expectMsg="The language is added!!!!!";
            }
        }
        //System.out.println(expectMsg);
        
        Log.endTestCase("The end of test case for Admin Add Language");

    }
}
