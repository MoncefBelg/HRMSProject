package steps;

public class Hooks extends CommonMethods {

    @Before
    public void start(){
        openBrowserAndNavigateToURL();
    }

    @After
    public void end(){

    }

}
