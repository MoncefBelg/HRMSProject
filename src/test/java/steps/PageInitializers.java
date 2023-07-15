package steps;

import pages.DashboardPage;
import pages.LoginPage;
import pages.MembershipsPage;

public class PageInitializers {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static MembershipsPage membership;

    public static void initializePageObject(){
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        membership = new MembershipsPage();
    }
}
