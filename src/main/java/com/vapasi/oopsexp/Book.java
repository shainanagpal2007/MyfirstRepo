package com.vapasi.oopsexp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Book {
    public String title;
    public String author;
    public double price;
    public Integer studentid;
    int pages;
    //constructor
    public Book() {

    }
    Scanner sc=new Scanner(System.in);
    //parametrized constructor
   public Book(String title, String author, double priceofbook) {
        this.title = title;
        this.author = author;
        this.price = priceofbook;
    }
    public String getTitle() {
        return title;

    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public String setTitle(String newTitle) {
        title = newTitle;
        return title;
    }
    public String setAuthor(String newauthor) {
        author = newauthor;
        return author;
    }
    public Boolean isRented()
    {
        return studentid!=null;
    }
    public void checkout(Integer studentid)
    {
        this.studentid=studentid;
    }
    public void checkin()
    {
    this.studentid=null;
    }

}
