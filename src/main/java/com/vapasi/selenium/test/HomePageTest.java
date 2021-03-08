package com.vapasi.selenium.test;

import com.vapasi.selenium.pages.HomePage;
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
    public void verifyproductselect()
    {
        basePage.searchKeyword();
        String prodselected=homePage.selectProduct();
        Assert.assertEquals(prodselected,selectedproduct);
    }
    @Test(priority = 6)
    public void verifyAddtoCart() {
        setUrl();
        basePage.searchKeyword();
        homePage.selectProduct();
        Double Price=homePage.addtoCart();
        Double Pricefinal= homePage.checkCart();
        Assert.assertEquals(Price,Pricefinal);
    }
    @Test(priority = 7)
    public void verifyClearCart()
    {
        setUrl();
        basePage.searchKeyword();
        homePage.selectProduct();
        homePage.addtoCart();
        homePage.clearCart();
    }
}
