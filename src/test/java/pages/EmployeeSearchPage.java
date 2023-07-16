package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeSearchPage extends CommonMethods {

    @FindBy(xpath = "//input[@id='empsearch_id']")
    public WebElement empIDField;

    @FindBy(xpath = "//input[@id='searchBtn']")
    public WebElement searchBtn;

    @FindBy(xpath = "//table[@id='resultTable']/tbody/tr[1]/td[2]")
   public WebElement IDTable;
    public EmployeeSearchPage(){
        PageFactory.initElements(driver, this);
    }

}
