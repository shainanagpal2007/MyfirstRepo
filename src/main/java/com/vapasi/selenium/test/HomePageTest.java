package com.vapasi.selenium.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test(priority = 3)
    public void selectcategory() throws InterruptedException {
        loginPage.login("vikrant2mahajan@gmail.com", "simple2@");
        homePage.select();
        String title = homePage.getTitle();
        Assert.assertEquals(title, "Mugs");
        System.out.println("Category selected");
    }

    @Test(priority = 4)
    public void verifySelectfilter() throws InterruptedException {
        loginPage.login("vikrant2mahajan@gmail.com", "simple2@");
        homePage.select();
        String filter = "$10.00 - $15.00";
        String selectedfiter = homePage.selectFilter(filter);
        Assert.assertEquals(filter, selectedfiter);
        System.out.println("Verified filters");
    }

    @Test(priority = 5)
    public void verifyproductselect() throws InterruptedException {
        loginPage.login("vikrant2mahajan@gmail.com", "simple2@");
        homePage.select();
        String filter = "$10.00 - $15.00";
        String selectedfiter = homePage.selectFilter(filter);
        homePage.selectProduct();
    }
}
