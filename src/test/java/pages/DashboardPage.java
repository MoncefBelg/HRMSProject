package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement employerListOption;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployeeButton;
    @FindBy(id = "menu_admin_Qualifications")
    public WebElement qualificationsOption;
    @FindBy(id = "menu_admin_membership")
    public WebElement membershipOption;
    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement AdminTabBtn;

    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }
}
