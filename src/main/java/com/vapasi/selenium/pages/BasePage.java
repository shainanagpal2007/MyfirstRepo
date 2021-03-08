package com.vapasi.selenium.pages;

import com.vapasi.selenium.helpers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Scanner;

public class BasePage extends Driver {
    public static By keywordtosearch= By.id("keywords");
    public static By searchbutton=By.xpath("//input[@type=\"submit\"]");
   // Scanner sc=new Scanner(System.in);
    //String keyword = "apache";
   String keyword = "Ruby on Rails Mug";

    public void searchKeyword()  {
        driver.findElement(keywordtosearch).clear();
        driver.findElement(keywordtosearch).sendKeys(keyword);
        driver.findElement(searchbutton).click();

    }
    public Boolean verifySearchResult()
    {
        Boolean iskeywordpresent=null;
        List<WebElement> elements = driver.findElements(By.cssSelector("#products>div"));
        for (WebElement webElement : elements) {
            if (webElement.getText().contains(keyword)) {
                iskeywordpresent=true;
            }
        }
    return iskeywordpresent;
    }
}
