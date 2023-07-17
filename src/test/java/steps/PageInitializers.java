package steps;

import pages.DashboardPage;
import pages.LoginPage;
import pages.TerminateEmployeePage;

public class PageInitializers {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static TerminateEmployeePage terminateEmployees;

    public static void initializePageObject(){
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        terminateEmployees=new TerminateEmployeePage();
    }
}
