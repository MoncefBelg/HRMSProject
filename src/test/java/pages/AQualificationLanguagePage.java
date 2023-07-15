package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AQualificationLanguagePage extends CommonMethods {
    // element to Admin module tab to be clicked
    @FindBy(xpath="//*[@id='menu_admin_viewAdminModule']")
    public WebElement adminModuleTab;

    // element to Admin qualifications to be clicked
    @FindBy(xpath="//*[@id='menu_admin_Qualifications']")
    public WebElement qualificationDropdown;

    // element to languages from qualification list to be clicked
    @FindBy(xpath="//*[@id='menu_admin_viewLanguages']")
    public WebElement languagesOptionList;

    // element to add language button to be clicked
    @FindBy(xpath="//*[@id='btnAdd']")
    public WebElement addLanguageButton;

    // element to language input field to be sentKey
    @FindBy(xpath="//*[@id='language_name']")
    public WebElement languageField;

    // element to save language button to be clicked
    @FindBy(xpath = "//*[@id='btnSave']")
    public WebElement saveLanguageButton;
    // when click either msg "Successfully saved" or "Name already exists appears"

    // locator for the dynamic table, but not used anywhere
    @FindBy(xpath = "//*[@id='recordsListTable']")
    public WebElement languageTable;

    //@FindBy(xpath = "//*[@id='recordsListTable']/tbody/tr/td[2]")
    //public WebElement languageTableColTwo;
    // could not get the elements with the above statements; that is why the below is used
    public static String languageColumn="//*[@id='recordsListTable']/tbody/tr/td[2]";

    // for initialization of all the elements in this page is called inside constructor
    public AQualificationLanguagePage(){
        PageFactory.initElements(driver, this);
    }
}
