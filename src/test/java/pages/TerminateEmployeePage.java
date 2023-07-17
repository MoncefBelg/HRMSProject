package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class TerminateEmployeePage extends CommonMethods {

    @FindBy(xpath = "//b[text()='PIM']")
    public WebElement pimOption;
    @FindBy(xpath = "//a[text()='Employee List']")
    public WebElement empList;
    @FindBy(xpath = "//input[@name='empsearch[id]']")
    public WebElement empSearchField;
    @FindBy(xpath = "//input[@id='searchBtn']")
    public WebElement empSearchBtn;
    @FindBy(xpath = "//table[@class='table hover']//tbody[1]//td[2]//a")
    public WebElement empSearchResult;
    @FindBy(xpath = "//ul[@id='sidenav']//li[6]//a")
    public WebElement jobBtn;
    @FindBy(xpath = "//input[@id='btnTerminateEmployement']")
    public WebElement terminateBtn;
    @FindBy(xpath = "//input[@id='dialogConfirm']")
    public WebElement terminationConfirm;
    @FindBy(xpath = "//label[@id='terminatedDate']")
    public WebElement confirmationMessage;

    public TerminateEmployeePage(){
        PageFactory.initElements(driver,this);
    }
}
