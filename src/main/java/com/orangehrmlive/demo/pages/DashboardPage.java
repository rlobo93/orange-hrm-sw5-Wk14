package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {

    DashboardPage dashboardPage = new DashboardPage();

    //click on admin tab
    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement admin;
    public void clickAdminTab(){
        clickOnElement(admin);
    }


    @FindBy(partialLinkText = "Welcome")
    WebElement welcome;
    public String getWelcomeText(){
        return getTextFromElement(welcome);
    }





}
