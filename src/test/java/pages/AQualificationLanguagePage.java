package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AQualificationLanguagePage extends CommonMethods {
    // element to Admin module tab to be clicked
    @FindBy(xpath="//*[@id='menu_admin_viewAdminModule']")
    public WebElement adminModuleTab;
    // element to Admin qualifications dropdown to hover mouse
    @FindBy(xpath="//*[@id='menu_admin_Qualifications']")
    public WebElement qualificationDropdown;
    // element to languages from qualification list to be clicked
    // the below element and above element seems like one list
    @FindBy(xpath="//*[@id='menu_admin_viewLanguages']")
    public WebElement languagesOptionList;
    // element to add language button to be clicked
    @FindBy(xpath="//*[@id='btnAdd']")
    public WebElement addLanguageButton;
    // element to language input field to be sendKey(ed)
        // to prevent hard coding the language can be either from feature file or config file (preferred)
    // when add button is click then it appears to an element is available in HTML
    @FindBy(xpath="//*[@id='language_name']")
    public WebElement languageField;
    // element to save language button to be clicked
    @FindBy(xpath = "//*[@id='btnSave']")
    public WebElement saveLanguageButton;
    // when click either msg "Successfully saved" or "Name already exists"
    // both msgs could be used in expected msgs for successful test
    // or the entered language is required to be verified in the table below
    // the below table is a dynamic table
    @FindBy(xpath = "//*[@id='recordsListTable']")
    public WebElement languageTable;

    // for initialization of all the elements in this page is called inside constructor
    public AQualificationLanguagePage(){
        PageFactory.initElements(driver, this);
    }
}
