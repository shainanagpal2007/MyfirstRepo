package com.vapasi.selenium.test;

import com.vapasi.selenium.helpers.TestListenerImpl;
import com.vapasi.selenium.helpers.Utils;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(TestListenerImpl.class)
public class HomePageTest extends BaseTest{


    String selectedproduct="Ruby on Rails Mug";
    String category="Mugs";
    String filter = "$10.00 - $15.00";

    @Test
    public void VerifySearch() throws InterruptedException, IOException {
        setUrl();
        homePage.searchKeyword();
        Assert.assertTrue(homePage.verifySearchResult());
        Utils.takeScreenshot(driver);
    }
    @Test(priority = 3)
    public void selectcategory() throws InterruptedException {
        setUrl();
        homePage.setCategory();
        String title = homePage.getTitle();
        Assert.assertEquals(title, category);
        System.out.println("Category selected");
    }

    @Test(priority = 4)
    public void verifySelectfilter() throws InterruptedException {
        //To make test independent starting it from login
        setUrl();
        homePage.setCategory();
        String selectedfiter = homePage.selectFilter(filter);
        Assert.assertEquals(filter, selectedfiter);
    }
    @Test(priority = 5)
    public void verifyPriceFilterResults()
    {
        setUrl();
        homePage.selectFilter(filter);
        Assert.assertTrue(homePage.verifyPrice());
    }
    @Test(priority = 7)
    public void verifyproductselect() throws InterruptedException {
        setUrl();
        homePage.searchKeyword();
        String prodselected=homePage.selectProduct();
        Thread.sleep(3000);
        Assert.assertEquals(prodselected,selectedproduct);

    }
    @Test(priority = 6)
    public void verifyAddtoCart() throws InterruptedException {
        setUrl();
        homePage.searchKeyword();
        homePage.selectProduct();
        Double Price=homePage.addtoCart();
        Double Pricefinal= homePage.checkCart();
        Assert.assertEquals(Price,Pricefinal);
    }

    @Test(priority = 7)
    public void verifyClearCart()
    {
        setUrl();
        homePage.searchKeyword();
        homePage.selectProduct();
        homePage.addtoCart();
        homePage.clearCart();
       // Assert.assertTrue();
    }
}
