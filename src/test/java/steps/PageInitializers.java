package steps;

import pages.DashboardPage;
import pages.EmployeeSearchPage;
import pages.LoginPage;

public class PageInitializers {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static EmployeeSearchPage employeeSearchPage;

    public static void initializePageObject(){
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        employeeSearchPage=new EmployeeSearchPage();
    }
}
