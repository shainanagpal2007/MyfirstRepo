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

    @FindBy(xpath = "//*[contains(text(),'Signed out successfully.')]")
    WebElement LOGOUTMSG;


    public LoginPage() {
        super();
    }

    public String getLoginmsg() {
        return LOGINMSG.getText();
    }

    public String getLogOutMsg() {
        return LOGOUTMSG.getText();
    }


    public void setUsername(String name) {
        USERNAME.sendKeys(name);
    }

    public void waitForBasePageLoad() {
        wait.until(ExpectedConditions.visibilityOf(LOGINPAGELINK));
    }

    public void waitForLoad() {
        wait.until(ExpectedConditions.visibilityOf(LOGINPAGELINK));
    }

    public void waitForlogout() {
        wait.until(ExpectedConditions.visibilityOf(LOGOUTBUTTON));
    }

    public void setPassword(String pwd) {
        PASSWORD.sendKeys(pwd);
    }

    public void clickLogin() {
        LOGINBUTTON.click();
    }

    public void clickLoginLink() {
        LINKTOLOGIN.click();
    }

    public void login(String name, String pwd) throws InterruptedException {

        Driver.clearCookies();
        Driver.getDriver();
        Driver.setUrl();
        waitForBasePageLoad();
        clickLoginLink();
        waitForLoad();
        this.setUsername(name);
        this.setPassword(pwd);
        this.clickLogin();
        Thread.sleep(2000);

    }

    public void logOut() {
        waitForlogout();
        LOGOUTBUTTON.click();
    }

}
