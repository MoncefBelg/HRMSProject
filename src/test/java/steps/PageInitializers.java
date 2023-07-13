package steps;

public class PageInitializers {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    public static void initializePageObjects(){
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
    }
}
