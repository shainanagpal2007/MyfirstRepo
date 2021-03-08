package com.vapasi.selenium.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(priority=1)
    public void testLogin() throws InterruptedException {
        loginPage.login("vikrant2mahajan@gmail.com", "simple2@");
        Thread.sleep(2000);
        String successmsg = loginPage.getLoginmsg();
        Assert.assertTrue(successmsg.equals("Logged in successfully"));
    }

    @Test(priority=2)
    public void TestLogout() {
        loginPage.logOut();
        Assert.assertTrue(loginPage.getLogOutMsg().equals("Signed out successfully."));
    }
}
