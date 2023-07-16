package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeePage extends CommonMethods {

    @FindBy(xpath="//*[@id='menu_pim_viewMyDetails']/b")
    public WebElement MyInfo;

    @FindBy(xpath="//*[@id='sidenav']/li[2]/a")
    public WebElement ContactDetails;

    @FindBy(xpath="//*[@id='btnSave']")
    public WebElement edit; //click

    @FindBy(xpath="//*[@id='contact_emp_mobile']")
    public WebElement mobile;

    @FindBy(xpath ="//*[@id='contact_emp_work_email']")
    public WebElement workEmail;

    @FindBy(xpath = "//*[@id='btnSave']")
    public WebElement saveButton; //click

    public EmployeePage() {
        PageFactory.initElements(driver, this);
    }

}
