package com.vapasi.selenium.test;

import com.vapasi.selenium.helpers.Driver;
import com.vapasi.selenium.helpers.Utils;
import com.vapasi.selenium.pages.BasePage;
import com.vapasi.selenium.pages.HomePage;
import com.vapasi.selenium.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class BaseTest extends Driver{
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected BasePage basePage;

    @BeforeClass
    public void init() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        basePage=new BasePage();
        Driver.clearCookies();
    }

    @AfterTest
    public void close(){
        driver.close();
    }

}
