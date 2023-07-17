package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddMembershipDetailsPage extends CommonMethods {

    @FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
    public WebElement myInfoButton;

    @FindBy(xpath ="//a[text()='Memberships']")
    public WebElement membershipsOpt;

    @FindBy(xpath = "//input[@id='btnAddMembershipDetail']")
    public WebElement addButton;

    @FindBy(xpath = "//select[@id='membership_membership']")
    public WebElement Membership;

    @FindBy(xpath = "//select[@id='membership_subscriptionPaidBy']")
    public WebElement subscriptionPaidBy;

    @FindBy(xpath = "//input[@id='membership_subscriptionAmount']")
    public WebElement membershipSubscriptionAmount;

    @FindBy(xpath = "//select[@id='membership_currency']")
    public WebElement membershipCurrency;

    @FindBy(xpath = "//input[@id='membership_subscriptionCommenceDate']")
    public WebElement subscriptionCommenceDateCalendar;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement subscriptionCommenceDateMonth;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement subscriptionCommenceDateYear;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> subscriptionCommenceDateDay;

    @FindBy(xpath = "//input[@id='membership_subscriptionRenewalDate']")
    public WebElement subscriptionRenewalDateCalendar;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement subscriptionRenewalDateMonth;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement subscriptionRenewalDateYear;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> subscriptionRenewalDateDay;

    @FindBy(xpath = "//input[@id='btnSaveMembership']")
    public WebElement btnSaveMembership;

    @FindBy(xpath = "//div[@class='message success fadable']")
    public WebElement msgSuccess;

    public AddMembershipDetailsPage(){
        PageFactory.initElements(driver, this);
    }


}
