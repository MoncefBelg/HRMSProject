package steps;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import utils.CommonMethods;
public class Hooks extends CommonMethods {

    @Before
    public void start(){
        openBrowserAndNavigateToURL();
    }

    @After
    public void end(Scenario scenario){
        byte[] picture;
        if(scenario.isFailed()) {
            picture = screenShot("failed/" + scenario.getName());
        }else {
            picture = screenShot("passed/" + scenario.getName());
        }
        picture = screenShot(scenario.getName());

        scenario.attach(picture, "image/png", scenario.getName());

        closeBrowser();
    }
}
