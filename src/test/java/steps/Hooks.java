package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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

        scenario.attach(picture, "image/png", scenario.getName());

        closeBrowser();
    }
}
