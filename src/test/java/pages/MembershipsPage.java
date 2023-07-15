package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class MembershipsPage extends CommonMethods {


	@FindBy(id = "membership_membership")
	public WebElement membership;


	@FindBy(id = "btnSave")
	public WebElement btnSaveMembership;


	@FindBy(xpath = "//div[@class = 'message success fadable']")
	public WebElement successMessage;
	@FindBy(id = "btnAdd")
	public WebElement addMembershipBtn;

	@FindBy(id = "membership_name")
	public WebElement MembershipNameField;

	public MembershipsPage() {
		PageFactory.initElements(driver, this);
	}
}
