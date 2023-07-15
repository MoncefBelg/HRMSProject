package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AQualificationLanguagePage;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

import java.util.List;

import static pages.AQualificationLanguagePage.languageColumn;

public class AdminAddLanguageSteps extends CommonMethods {

    @When("user navigates to Qualification and selects Languages")
    public void user_navigates_to_qualification_and_selects_languages() {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("Start test case for Admin Add Language");

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
        String dynamicLanguage = ConfigReader.getPropertyValue("language")+ getTimeStamp("HHmmss");
        sendText(dynamicLanguage,aQualificationLanguagePage.languageField);
        Log.info("Admin enters the intended language in language name field");

        click(aQualificationLanguagePage.saveLanguageButton);
        Log.info("Admin clicks on save button");

        List<WebElement> allLanguages =
                driver.findElements(By.xpath(languageColumn));
                //driver.findElements(By.xpath("//*[@id='recordsListTable']/tbody/tr/td[2]"));
        Log.info("gather data from the language column");

        String expectMsg="";
        boolean isAdded=false;

        for(int i=0;i<allLanguages.size();i++){
            String language = allLanguages.get(i).getText();
            if(language.equals(dynamicLanguage)){
                expectMsg="The language is added!!!!!";
                isAdded=true;
            }
        }

        Log.info("Verifies if language is added or already exists");
        Log.info(expectMsg);

        Assert.assertTrue(isAdded);

        Log.endTestCase("Admin Add Language");
    }
}
