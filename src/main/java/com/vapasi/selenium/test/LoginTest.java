package com.vapasi.selenium.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(priority=1)
    public void testLogin() throws InterruptedException {
        loginPage.login("shainanagpal12111987@gmail.com", "vapasi1234");
        String successmsg = loginPage.getLoginmsg();
        Assert.assertTrue(successmsg.equals("Logged in successfully"));
    }

    @Test(priority=2)
    public void TestLogout() throws InterruptedException{
        loginPage.login("vikrant2mahajan@gmail.com", "simple2@");
        loginPage.logOut();
        Assert.assertTrue(loginPage.getLogOutMsg().equals("Signed out successfully."));
    }
}
