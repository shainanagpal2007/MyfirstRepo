package com.vapasi.selenium.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    String username="shainanagpal12111987@gmail.com";
    String password="vapasi1234";
    @Test(priority=1)
    public void testLogin() throws InterruptedException {
        loginPage.login(username, password);
        String successmsg = loginPage.getLoginmsg();
        Assert.assertTrue(successmsg.equals("Logged in successfully"));
    }

    @Test(priority=2)
    public void TestLogout() throws InterruptedException{
        loginPage.login(username, password);
        loginPage.logOut();
        Assert.assertTrue(loginPage.getLogOutMsg().equals("Signed out successfully."));
    }
}
