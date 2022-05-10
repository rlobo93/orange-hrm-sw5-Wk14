package com.orangehrmlive.demo.testsuite;

import com.google.common.base.Verify;
import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;


public class LoginTest extends TestBase {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    SystemUsersPage systemUsersPage;
    AdminPage adminPage;
    HomePage homePage = new HomePage();


    @BeforeMethod
    public void inIt() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        systemUsersPage = new SystemUsersPage();
        adminPage = new AdminPage();
        homePage = new HomePage();
    }

    @Test(dataProvider = "login", dataProviderClass = TestData.class,groups = {"sanity","smoke","regression"})
    public void verifyUserShouldLoginSuccessFully(String username, String password) {
//    Enter username
        loginPage.enterUsername(username);

//    Enter password
        loginPage.enterPassword(password);
//    Click on Login Button
        loginPage.clickOnLoginButton();

//    Verify "WelCome" Message


    }


    @Test(dataProvider = "login", dataProviderClass = TestData.class,groups = {"sanity","smoke","regression"})
    public void verifyThatTheLogoDisplayOnHomePage(String username, String password) {
//    Login To The application
        loginPage.loginToApplication(username, password);
//    Verify Logo is Displayed
    }


    @Test(dataProvider = "login", dataProviderClass = TestData.class,groups = {"sanity","smoke","regression"})
    public void verifyUserShouldLogOutSuccessFully(String username, String password) {
//    Login To The application
        loginPage.loginToApplication(username, password);
//    Click on User Profile logo
        homePage.mouseHoverAndClickOnWelcomeText();
//    Mouse hover on "Logout" and click
        homePage.mouseHoverAndClickLogOutButton();

//    Verify the text "Login Panel" is displayed
        String expectedMessage = "Login Panel";
        String actualMessage = loginPage.logInPanelText();
        Assert.assertEquals(expectedMessage, actualMessage);





    }


}
