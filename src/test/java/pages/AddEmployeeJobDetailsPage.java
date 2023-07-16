package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddEmployeeJobDetailsPage extends CommonMethods {

    @FindBy(xpath = "//select[@id='job_job_title']")
    public WebElement jobTitle;

    @FindBy(xpath = "//input[@id='btnSave']")
    public WebElement editBtn;

    @FindBy(xpath = "//select[@id='job_emp_status']")
    public WebElement employmentStatus;

    @FindBy(xpath = "//input[@id='job_joined_date']")
    public WebElement joinedDateCalendar;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement joinedDateMonth;
    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement joinedDateYear;
    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> joinedDateAllDays;

    @FindBy(xpath = "//select[@id='job_sub_unit']")
    public WebElement subUnit;

    @FindBy(xpath = "//select[@id='job_location']")
    public WebElement location;

    @FindBy(xpath = "//input[@name='job[contract_start_date]']")
    public WebElement startDateContractCalendar;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement startDateContractMonth;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement startDateContractYear;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> startDateContractAllDays;

    @FindBy(xpath = "//input[@id='job_contract_end_date']")
    public WebElement endDateContractCalendar;
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement endDateContractMonth;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement endDateContractYear;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> endDateContractAllDays;

    @FindBy(xpath = "//input[@id='job_contract_file']")
    public WebElement chooseFile;

    @FindBy(xpath = "//input[@id='btnSave']")
    public WebElement saveBtn;

    @FindBy(xpath = "//input[@name='job[contract_update]']")
    public List<WebElement> allCheckBox;

    @FindBy(xpath = "//div[@class='message success fadable'] ")
    public WebElement message;

    public AddEmployeeJobDetailsPage(){
        PageFactory.initElements(driver, this);
    }
}
