package com.vapasi.selenium.pages;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    private WebElement element;
    public static By keywordtosearch = By.id("keywords");
    public static By searchbutton = By.xpath("//input[@type=\"submit\"]");

    String keyword = "Ruby on Rails Mug";

    @FindBy(xpath = "//a[@href='/t/mugs']")
    WebElement SELECTCATEGORY;

    @FindBy(xpath = "//ul[@class='list-group']//li")
    List<WebElement> SELECTFILTER;

    @FindBy(className = "taxon-title")
    WebElement CATEGORYTITLE;

    @FindBy(css = "#products>div")
    List<WebElement> PRODUCTLIST;

    @FindBy(id = "add-to-cart-button")
    WebElement ADDTOCARTBUTTON;

    @FindBy(xpath = "//span[@class='lead price selling']")
    WebElement PRODUCTPRICE;

    @FindBy(className = "lead text-primary cart-item-price")
    WebElement PRICEONCHECKOUT;

    @FindBy(xpath = "//input[@value='Empty Cart']")
    WebElement EMPTYCARTBUTTON;
    @FindBy(css="input[class='btn btn-primary']")
    WebElement SearchFilterButton;

    By PRODUCTTITLE=By.className("product-title");

    String minprice = null;
    String maxprice = null;
    public Double price = null;

    public HomePage() {
        super();
    }

    public void setCategory() throws InterruptedException {
        ExpectedConditions.visibilityOf(SELECTCATEGORY);
        SELECTCATEGORY.click();
        Thread.sleep(2000);
    }

    public String getTitle() {
        return CATEGORYTITLE.getText();
    }

    public String selectFilter(String filter) {
        String selectedfilter = null;
        for (int i = 0; i < SELECTFILTER.size(); i++) {
            if (SELECTFILTER.get(i).getText().equals(filter)) {
                selectedfilter = SELECTFILTER.get(i).getText().toString();
                minprice = SELECTFILTER.get(i).getText().substring(1, 5);
                maxprice = SELECTFILTER.get(i).getText().substring(10, 15);
                SELECTFILTER.get(i).click();
            }
        }
        SearchFilterButton.click();
        return selectedfilter;
    }

    public String selectProduct() {
        String Productname = "Ruby on Rails Mug";
        for (WebElement webElement : PRODUCTLIST) {
            if (webElement.getText().toString().contains(Productname)) {
                Productname = webElement.findElement(PRODUCTTITLE).toString();
                webElement.click();
            }
        }
        return Productname;
    }

    public Boolean verifyPrice() {
        Boolean pricematched = null;
        for (int i = 0; i < PRODUCTLIST.size(); i++) {
            price = Double.parseDouble(PRODUCTLIST.get(i).getText().toString().split("\\$")[1]);
            if (price >= Double.parseDouble(minprice) && price <= Double.parseDouble(maxprice)) {
                System.out.println("Valid price");
                pricematched = true;
            } else {
                System.out.println("Product not in price range");
                pricematched = false;
            }
        }
        return pricematched;
    }
    public Double addtoCart() {
        Double productprice = Double.parseDouble(PRODUCTPRICE.getText().substring(1, 4));
        ADDTOCARTBUTTON.isDisplayed();
        ADDTOCARTBUTTON.click();
        return productprice;
    }

    public Double checkCart() {
        Double productprice = Double.parseDouble(PRICEONCHECKOUT.getText().substring(1, 4));
        return productprice;
    }

    public void clearCart() {
        EMPTYCARTBUTTON.click();
    }

    public void searchKeyword() {
        driver.findElement(keywordtosearch).clear();
        driver.findElement(keywordtosearch).sendKeys(keyword);
        driver.findElement(searchbutton).click();

    }

    public Boolean verifySearchResult() {
        Boolean iskeywordpresent = null;
        for (WebElement webElement : PRODUCTLIST) {
            if (webElement.getText().contains(keyword)) {
                iskeywordpresent = true;
            }
        }
        return iskeywordpresent;
    }

}
