package com.orangehrmlive.demo.testsuite;


import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.SystemUsersPage;
import com.orangehrmlive.demo.testbase.TestBase;
import javafx.scene.control.Tab;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;


public class UsersTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    SystemUsersPage systemUsersPage;
    AdminPage adminPage;


    @BeforeMethod
    public void inIt() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        systemUsersPage = new SystemUsersPage();
        adminPage = new AdminPage();
    }


    @Test(dataProvider = "login", dataProviderClass = TestData.class, groups = {"sanity", "regression"})
    public void adminShouldAddUserSuccessFully(String username, String password) {

//    Login to Application
        loginPage.loginToApplication(username, password);

//    click On "Admin" Tab
        dashboardPage.clickAdminTab();

////    Verify "System Users" Text
//    String expectedMessage= "System Users\n" +
//            ">";
//    String actualMessage = systemUsersPage.verifySystemUsers();
//    Assert.assertEquals(expectedMessage,actualMessage );

//    click On "Add" button
        systemUsersPage.clickAddBtn();

//    Verify "Add User" Text
        String expectedMessage = "Add User";
        String actualMessage = systemUsersPage.verifyAddUser();
        Assert.assertEquals(expectedMessage, actualMessage);

//    Select User Role "Admin"
        systemUsersPage.selectUser("Admin");

//    enter Employee Name "Ananya Dash"
        systemUsersPage.enterName("Ananya Dash");

//    enter Username
        systemUsersPage.enterUsername("anna1234");

//    Select status "Disable"
        systemUsersPage.selectStatus("Disabled");

//    enter psaaword
        systemUsersPage.enterPassword("Asdfg123456!?");

//    enter Confirm Password
        systemUsersPage.enterConfirmPassword("Asdfg123456!?");

//    click On "Save" Button
        systemUsersPage.clickSaveButton();

//    verify message "Successfully Saved"
        String expectedMessage1 = "Successfully Saved";
        String actualMessage1 = systemUsersPage.verfySuccessfullySaved();
        Assert.assertEquals(expectedMessage1, actualMessage1);

    }


    @Test(dataProvider = "login", dataProviderClass = TestData.class, groups = {"smoke", "regression"})
    public void searchTheUserCreatedAndVerifyIt(String username, String password) {

//    Login to Application
        loginPage.loginToApplication(username, password);

//    click On "Admin" Tab
        dashboardPage.clickAdminTab();
//    Verify "System Users" Text
        //    String expectedMessage= "System Users\n" +
//            ">";
//    String actualMessage = systemUsersPage.verifySystemUsers();
//
//    Enter Username
        systemUsersPage.enterUsernameDashBoard("admin");

//    Select User Role
        systemUsersPage.selectUserRole("Admin");

//    Select Satatus
        systemUsersPage.selectSatatus("Enabled");

//    Click on "Search" Button
        systemUsersPage.clickSearchButton();
//    Verify the User should be in Result list.
        String expectedMessage1 = "Admin";
        String actualMessage1 = systemUsersPage.verifyUser();
        Assert.assertEquals(expectedMessage1, actualMessage1);


    }

    @Test(dataProvider = "login", dataProviderClass = TestData.class,groups = {"sanity","smoke","regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(String username, String password) {
//    Login to Application
        loginPage.loginToApplication(username, password);
//        click On "Admin" Tab
        dashboardPage.clickAdminTab();
//    Verify "System Users" Text
        //    String expectedMessage= "System Users\n" +
//            ">";
//    String actualMessage = systemUsersPage.verifySystemUsers();

//    Enter Username
        systemUsersPage.enterUsernameDashBoard("John Smith");
//    Select User Role
        systemUsersPage.selectUserRole("Admin");
//    Select Satatus
//    Click on "Search" Button
        systemUsersPage.selectSatatus("Enabled");
//    Verify the User should be in Result list.
        String expectedMessage1 = "John.Smith";
        String actualMessage1 = systemUsersPage.verifyUser();
        Assert.assertEquals(expectedMessage1, actualMessage1);

//    Click on Check box
        systemUsersPage.clickCheckBox();
//    Click on Delete Button
        systemUsersPage.clickDeleteBtn();
//    Popup will display
//    Click on Ok Button on Popup
        systemUsersPage.clickOkBTn();
//    verify message "Successfully Deleted"
    }

    @Test(dataProvider = "login", dataProviderClass = TestData.class,groups = {"sanity","smoke","regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(String username, String password) {
//    Login to Application
        loginPage.loginToApplication(username, password);
//        click On "Admin" Tab
        dashboardPage.clickAdminTab();
//    Verify "System Users" Text
        //    String expectedMessage= "System Users\n" +
//            ">";
//    String actualMessage = systemUsersPage.verifySystemUsers();

//    Enter Username
        systemUsersPage.enterUsernameDashBoard("ron");
//    Select User Role
        systemUsersPage.selectUserRole("Admin");
//    Select Satatus
        systemUsersPage.selectSatatus("Enabled");
//    Click on "Search" Button
        systemUsersPage.clickSearchButton();
//    verify message "No Records Found"
        String expectedMessage1 = "No Records Found";
        String actualMessage1 = systemUsersPage.verifyNoRecordsFoundText();
        Assert.assertEquals(expectedMessage1, actualMessage1);

    }


}
