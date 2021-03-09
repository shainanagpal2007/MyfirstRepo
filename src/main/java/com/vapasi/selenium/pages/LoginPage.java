package com.vapasi.selenium.pages;

import com.vapasi.selenium.helpers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    // @FindBy(xpath="//a[@href='/login']")
    // WebElement LOGINBUTTON;
    @FindBy(xpath = "//a[@href='/login']")
    WebElement LOGINPAGELINK;

    @FindBy(id = "spree_user_email")
    WebElement USERNAME;

    @FindBy(css = "input[type=\"password\"]")
    WebElement PASSWORD;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement LOGINBUTTON;

    @FindBy(id = "link-to-login")
    WebElement LINKTOLOGIN;

    @FindBy(css = "a[href=\"/logout\"]")
    WebElement LOGOUTBUTTON;

    @FindBy(xpath = "//*[contains(text(),'Logged in successfully')]")
    WebElement LOGINMSG;
    @FindBy(css="div[class='alert alert-notice']")
    WebElement REGISTERSUCCESSMSG;

    @FindBy(xpath = "//*[contains(text(),'Signed out successfully.')]")
    WebElement LOGOUTMSG;

    @FindBy(linkText="Create a new account")
    WebElement CREATEACCOUNTLINK;

    @FindBy(id="spree_user_password_confirmation")
    WebElement COMFIRMPASSWORD;
    @FindBy(css="input[class=\"btn btn-lg btn-success btn-block\"]")
    WebElement CREATENEWACCOUNTBUTTON;

    public LoginPage() {
        super();
    }
    public String getLoginmsg() {
        return LOGINMSG.getText();
    }
    public String getLogOutMsg() {
        return LOGOUTMSG.getText();
    }
    public String registerAccount(String username,String passowrd) throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(LOGINPAGELINK));
        LINKTOLOGIN.click();
        CREATEACCOUNTLINK.click();
        USERNAME.sendKeys(username);
        PASSWORD.sendKeys(passowrd);
        COMFIRMPASSWORD.sendKeys(passowrd);
        CREATENEWACCOUNTBUTTON.click();
        Thread.sleep(2000);
        return REGISTERSUCCESSMSG.getText();
    }
    public void login(String name, String pwd) throws InterruptedException {
        Driver.setUrl();
        wait.until(ExpectedConditions.visibilityOf(LOGINPAGELINK));
        LINKTOLOGIN.click();
        USERNAME.sendKeys(name);
        PASSWORD.sendKeys(pwd);
        LOGINBUTTON.click();
        Thread.sleep(2000);
    }
    public void logOut() {
        wait.until(ExpectedConditions.visibilityOf(LOGOUTBUTTON));
        LOGOUTBUTTON.click();
    }

}
