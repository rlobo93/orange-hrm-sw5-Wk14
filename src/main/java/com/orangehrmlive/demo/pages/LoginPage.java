package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.bouncycastle.util.Store;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

//    Store usename, password,
    @FindBy(id ="txtUsername")
    WebElement username;
    public void enterUsername(String text){
        sendTextToElement(username,text);
    }
    @FindBy(id ="txtPassword")
    WebElement password;
    public void enterPassword(String text){
        sendTextToElement(password,text);
    }



    public void loginToApplication(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickOnLoginButton();
    }



//    Login Button
    @FindBy(id ="btnLogin")
    WebElement loginBtn;
    public void clickOnLoginButton(){
        clickOnElement(loginBtn);
    }

//    LOGIN Panel text Locators and create appropriate methods for it.
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement loginPanel;
     public String getLoginPanel(){
         return getTextFromElement(loginPanel);
     }



@FindBy(xpath ="//div[@id='logInPanelHeading']" )
    WebElement loginpanelText;
    public String logInPanelText() {
        return getTextFromElement(loginpanelText);
    }







}
