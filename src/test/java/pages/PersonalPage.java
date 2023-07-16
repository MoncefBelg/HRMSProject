package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class PersonalPage extends CommonMethods {

      @FindBy(xpath = "//ul[@id=\"sidenav\"]/li[6]")
    public WebElement personalDetailJob;

      public PersonalPage(){
          PageFactory.initElements(driver,this);
      }
}
