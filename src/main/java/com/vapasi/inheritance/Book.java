package com.vapasi.inheritance;

public class Book {
    public String title;
    public String author;
    public double price;
    int pages;
    public static int numberofbooks;
    //constructor
    public Book() {
        numberofbooks++;
    }
    //parametrized constructor
   public Book(String title, String author, double priceofbook) {
        this.title = title;
        this.author = author;
        this.price = priceofbook;
        numberofbooks++;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
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
       // numberofbooks = numberofbooks + 1;
        title = newTitle;
        return title;
    }

    public String setAuthor(String newauthor) {
        //numberofbooks = numberofbooks + 1;
        author = newauthor;
        return author;
    }

}
