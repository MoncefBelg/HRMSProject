package steps;

import pages.*;

public class PageInitializers {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static EmployeeSearchPage employeeSearchPage;
    public static PersonalPage personalPage;
    public static AddEmployeeJobDetailsPage addEmployeeJobDetailsPage;

    public static AddMembershipDetailsPage addMembershipDetailsPage;

    public static void initializePageObject(){
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        employeeSearchPage=new EmployeeSearchPage();
        personalPage=new PersonalPage();
        addEmployeeJobDetailsPage =new AddEmployeeJobDetailsPage();
        addMembershipDetailsPage=new AddMembershipDetailsPage();
    }
}
