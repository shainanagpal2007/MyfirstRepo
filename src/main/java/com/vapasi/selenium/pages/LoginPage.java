package com.vapasi.selenium.pages;

import com.vapasi.selenium.helpers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    public static final By LOGINPAGELINK = By.xpath("//a[@href='/login']");
    public static final By USERNAME = By.id("spree_user_email");
    public static final By PASSWORD = By.cssSelector("input[type=\"password\"]");
    public static final By LOGINBUTTON = By.xpath("//input[@value='Login']");
    public static final By LINKTOLOGIN = By.id("link-to-login");
    public static final By LOGOUTBUTTON = By.cssSelector("a[href=\"/logout\"]");
    public static final By LOGINMSG = By.xpath("//*[contains(text(),'Logged in successfully')]");
    public static final By LOGOUTMSG = By.xpath("//*[contains(text(),'Signed out successfully.')]");

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage() {
        this.driver = Driver.getDriver();
        this.wait = Driver.getWait();
    }

    public String getLoginmsg() {
        return driver.findElement(LOGINMSG).getText();
    }

    public String getLogOutMsg() {
        return driver.findElement(LOGOUTMSG).getText();
    }


    public void setUsername(String name) {
        driver.findElement(USERNAME).sendKeys(name);
    }

    public void waitForLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("spree_user_email")));
    }

    public void waitForlogout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGOUTBUTTON));
    }

    public void setPassword(String pwd) {
        driver.findElement(PASSWORD).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(LOGINBUTTON).click();
    }

    public void clickLoginLink() {
        driver.findElement(LINKTOLOGIN).click();
    }

    public void login(String name, String pwd) throws InterruptedException {
        driver.manage().deleteAllCookies();
        clickLoginLink();
        waitForLoad();
        this.setUsername(name);
        this.setPassword(pwd);
        this.clickLogin();
        Thread.sleep(2000);
    }

    public void logOut() {
        waitForlogout();
        driver.findElement(LOGOUTBUTTON).click();
    }

}
