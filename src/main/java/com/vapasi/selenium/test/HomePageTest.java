package com.vapasi.selenium.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class HomePageTest extends BaseTest {

    String username="shainanagpal12111987@gmail.com";
    String password="vapasi1234";
    String selectedproduct="Ruby on Rails Mug";

    @Test(priority = 3)
    public void selectcategory() throws InterruptedException {
        loginPage.login(username, password);
        homePage.select();
        String title = homePage.getTitle();
        Assert.assertEquals(title, "Mugs");
        System.out.println("Category selected");
    }

    @Test(priority = 4)
    public void verifySelectfilter() throws InterruptedException {
        //To make test independent starting it from login
        loginPage.login(username, password);
        homePage.select();
        String filter = "$10.00 - $15.00";
        String selectedfiter = homePage.selectFilter(filter);
        Assert.assertEquals(filter, selectedfiter);
        System.out.println("Verified filters");
        Assert.assertTrue(homePage.verifyPrice());
    }

    @Test(priority = 5)
    public void verifyproductselect() throws InterruptedException {

        loginPage.login(username, password);
        homePage.select();
        String filter = "$10.00 - $15.00";
        String selectedfiter = homePage.selectFilter(filter);
        String prodselected=homePage.selectProduct();
        Assert.assertEquals(prodselected,selectedproduct);
    }
}
