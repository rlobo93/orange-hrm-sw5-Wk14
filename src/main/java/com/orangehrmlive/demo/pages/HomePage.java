package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.bouncycastle.util.Store;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {


    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="//a[contains(text(),'Logout')]")
    WebElement logoutButton;

    public void mouseHoverAndClickLogOutButton(){

        mouseHoverToElementAndClick(logoutButton);
    }


    @FindBy(id = "welcome")
    WebElement welcomeText;
    public void mouseHoverAndClickOnWelcomeText(){

        mouseHoverToElementAndClick(welcomeText);
    }



}
