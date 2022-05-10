package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemUsersPage extends Utility {

    //System Users

    @FindBy(xpath = "//a[@class='toggle tiptip']")
    WebElement systemText;
    public String verifySystemUsers(){
        return getTextFromElement(systemText);
    }

    //    click On "Add" button
    @FindBy(id="btnAdd")
    WebElement addBtn;
    public void clickAddBtn(){
        clickOnElement(addBtn);
    }

//    Verify "Add User" Text
    @FindBy(id = "UserHeading")
    WebElement addusertext;
    public String verifyAddUser(){
        return getTextFromElement(addusertext);
    }

//    Select User Role "Admin"
    @FindBy(id = "systemUser_userType")
    WebElement selectuser;
    public void selectUser(String text){
        selectByVisibleTextFromDropDown(selectuser,text);
    }


    //   Admin

//    enter Employee Name "Ananya Dash"
    @FindBy(id = "systemUser_employeeName_empName")
    WebElement name;
    public void enterName(String text){
        sendTextToElement(name,text);
    }

//    enter Username
    @FindBy(id ="systemUser_userName")
    WebElement username;
    public void enterUsername(String text){
        sendTextToElement(username,text);
    }


//    Select status "Disable"
    @FindBy(id ="systemUser_status")
    WebElement status;
    public void selectStatus(String text){
        selectByVisibleTextFromDropDown(status,text);
    }

//    enter psaword
    @FindBy(id = "systemUser_password")
    WebElement pass;
    public void enterPassword(String password){
        sendTextToElement(pass,password);
    }

//    enter Confirm Password
    @FindBy(id = "systemUser_confirmPassword")
    WebElement confirmpass;
    public void enterConfirmPassword(String password){
        sendTextToElement(confirmpass,password);
    }



//    click On "Save" Button
    @FindBy(id="btnSave")
    WebElement saveBtn;
    public void clickSaveButton(){
        clickOnElement(saveBtn);
    }


//    verify message "Successfully Saved"
    @FindBy(linkText = "Successfully Saved" )
    WebElement message;
    public String verfySuccessfullySaved(){
        return getTextFromElement(message);
    }


    //    Enter Username
    @FindBy(id = "searchSystemUser_userName")
    WebElement getusername;
    public void enterUsernameDashBoard(String text){
        sendTextToElement(getusername,text);
    }
//    Select User Role
    @FindBy(id = "searchSystemUser_userType")
    WebElement userRole;
    public void selectUserRole(String text){
        selectByVisibleTextFromDropDown(userRole,text);
    }

//    Select Satatus
@FindBy(id = "searchSystemUser_status")
WebElement getStatus;
    public void selectSatatus(String text){
        selectByVisibleTextFromDropDown(getStatus,text);
    }

//    Click on "Search" Button
@FindBy(id = "searchBtn")
WebElement searchBtn;
    public void clickSearchButton(){
    clickOnElement(searchBtn);
    }


//    Verify the User should be in Result list.
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    WebElement userResult;
    public String verifyUser(){
        return getTextFromElement(userResult);
    }

//    Click on Check box
    @FindBy(id ="ohrmList_chkSelectRecord_2")
    WebElement checkBox;
    public void clickCheckBox(){
        clickOnElement(checkBox);
    }

//    Click on Delete Button
    @FindBy(id = "btnDelete")
    WebElement delete;
    public void clickDeleteBtn(){
        clickOnElement(delete);
    }

//    Popup will display
//    Click on Ok Button on Popup
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement okBtn;
    public void clickOkBTn(){
        clickOnElement(okBtn);
    }

//    verify message "Successfully Deleted"
    @FindBy()
    WebElement successfulMessage;
    public String verifySuccessfulMessage(){
        return getTextFromElement(successfulMessage);
    }




   //   verify message "No Records Found"
    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement errormessage;
    public String verifyNoRecordsFoundText(){
        return getTextFromElement(errormessage);
    }

}
