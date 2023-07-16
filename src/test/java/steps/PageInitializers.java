package steps;

import pages.AQualificationLanguagePage;
import pages.DashboardPage;
import pages.EmployeePage;
import pages.LoginPage;

public class PageInitializers {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AQualificationLanguagePage aQualificationLanguagePage;
    public static EmployeePage employeePage;

    public static void initializePageObject(){
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        aQualificationLanguagePage = new AQualificationLanguagePage();
        employeePage = new EmployeePage();
    }
}
