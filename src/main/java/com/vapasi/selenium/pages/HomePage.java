package com.vapasi.selenium.pages;

import com.vapasi.selenium.helpers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    private WebDriver driver;
    private WebElement element;
    public static final By SELECTCATEGORY = By.xpath("//a[@href='/t/mugs']");
    public static final By SELECTFILTER = By.xpath("//ul[@class='list-group']");
    public static final By CATEGORYTITLE = By.className("taxon-title");
    public static final By PRODUCTLIST = By.id("products");
    String minprice = null;
    String maxprice = null;

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
        List<WebElement> elements = element.findElements(By.xpath("//ul[@class='list-group']//li"));
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals(filter)) {
                selectedfilter = elements.get(i).getText().toString();
                minprice = elements.get(i).getText().substring(1, 5);
                maxprice = elements.get(i).getText().substring(10, 15);
            }
        }
        return selectedfilter;
    }

    public void selectProduct() {
        String Productname = "Ruby on Rails Mug";
        List<WebElement> elements = driver.findElements(By.id("products"));

        for (WebElement webElement : elements) {
            if (webElement.getText().toString().contains(Productname)) {
                webElement.click();
            }
            //element.findElement(By.xpath("//span[@content='13.99']"))
        }
        verifyPrice();
    }

    public void verifyPrice() {
        List<WebElement> elements = driver.findElements(By.cssSelector("#products>div"));
        for (int i = 0; i < elements.size(); i++) {
            Double price = null;
            price = Double.parseDouble(elements.get(i).getText().toString().split("\\$")[1]);
            if (price >= Double.parseDouble(minprice) && price <= Double.parseDouble(maxprice)) {
                System.out.println("Valid price");
            } else
                System.out.println("Product not in price range");
        }
    }

}
