package com.vapasi.selenium.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    String username="test10@gmail.com";
    String password="vapasi1234";
    @Test(priority=1)
    public void createNewAccount() throws InterruptedException {
        setUrl();
        String successmsg=loginPage.registerAccount(username,password);
        Assert.assertTrue(successmsg.equals("Welcome! You have signed up successfully."));
        Thread.sleep(2000);
    }
    @Test(priority=2)
    public void testLogin() throws InterruptedException {
        loginPage.login(username, password);
        String successmsg = loginPage.getLoginmsg();
        Assert.assertTrue(successmsg.equals("Logged in successfully"));
    }

    @Test(priority=3)
    public void TestLogout() throws InterruptedException{
        loginPage.login(username, password);
        loginPage.logOut();
        Assert.assertTrue(loginPage.getLogOutMsg().equals("Signed out successfully."));
    }
}
