package com.vapasi.selenium.test;

import com.vapasi.selenium.helpers.Driver;
import com.vapasi.selenium.pages.HomePage;
import com.vapasi.selenium.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected LoginPage loginPage;
    protected HomePage homePage;

    @BeforeClass
    public void init() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        Driver.clearCookies();
    }

    @AfterTest
    public void close(){
        Driver.close();
    }

}
