package com.vapasi.selenium.pages;

import com.vapasi.selenium.helpers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {
    private WebDriver driver;
    private WebElement element;
    public static final By SELECTCATEGORY = By.xpath("//a[@href='/t/mugs']");
    public static final By SELECTFILTER = By.xpath("//ul[@class='list-group']//li");
    public static final By CATEGORYTITLE = By.className("taxon-title");
    public static final By PRODUCTLIST = By.id("#products>div");
    public static final By ADDTOCARTBUTTON=By.id("add-to-cart-button");
    public static final By PRODUCTPRICE=By.xpath("//span[@class='lead price selling']");
    public static final By PRICEONCHECKOUT=By.className("lead text-primary cart-item-price");
    public static final By EMPTYCARTBUTTON=By.xpath("//input[@value='Empty Cart']");
    String minprice = null;
    String maxprice = null;
    public Double price = null;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public void setSelectcategory(By selectcategory) {
        driver.findElement(selectcategory).click();
    }

    public String getTitle() {
        return driver.findElement(CATEGORYTITLE).getText();
    }


    public void select() {
        setSelectcategory(SELECTCATEGORY);
    }

    public String selectFilter(String filter) {
        String selectedfilter = null;


        element = driver.findElement(SELECTFILTER);
        List<WebElement> elements = element.findElements(SELECTFILTER);
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals(filter)) {
                selectedfilter = elements.get(i).getText().toString();
                minprice = elements.get(i).getText().substring(1, 5);
                maxprice = elements.get(i).getText().substring(10, 15);
            }
        }
        return selectedfilter;
    }

    public String selectProduct() {
        String Productname = "Ruby on Rails Mug";
        List<WebElement> elements = driver.findElements(PRODUCTLIST);

        for (WebElement webElement : elements) {
            if (webElement.getText().toString().contains(Productname)) {
                webElement.click();
                Productname=webElement.findElement(By.className("product-title")).toString();
            }
        }
        return Productname;
    }

    public Boolean verifyPrice() {
        Boolean pricematched = null;
        List<WebElement> elements = driver.findElements(By.cssSelector("#products>div"));
        for (int i = 0; i < elements.size(); i++) {

            price = Double.parseDouble(elements.get(i).getText().toString().split("\\$")[1]);
            if (price >= Double.parseDouble(minprice) && price <= Double.parseDouble(maxprice)) {
                System.out.println("Valid price");
                pricematched=true;
            } else {
                System.out.println("Product not in price range");
                pricematched= false;
            }
        }
        return pricematched;
    }
    public Double addtoCart()
    {
        Double productprice=Double.parseDouble(driver.findElement(PRODUCTPRICE).getText().substring(1,4));
        driver.findElement(ADDTOCARTBUTTON).isDisplayed();
        driver.findElement(ADDTOCARTBUTTON).click();
        return productprice;
    }
    public Double checkCart()
    {
        Double productprice=Double.parseDouble(driver.findElement(PRICEONCHECKOUT).getText().substring(1,4));
        return productprice;
    }
    public void clearCart()
    {
        ExpectedConditions.presenceOfElementLocated(EMPTYCARTBUTTON);
        driver.findElement(EMPTYCARTBUTTON).click();
    }

}
