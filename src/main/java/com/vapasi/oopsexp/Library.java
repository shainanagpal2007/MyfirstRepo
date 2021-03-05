package com.vapasi.oopsexp;

import java.util.*;

public class Library extends Facility{

     Map<String,Book> booksMap = new HashMap<>();
    int numberofbooksrented;
    public Library(int noOfChair, int noOfRacks, int noOfTables) {
        super(noOfChair, noOfRacks, noOfTables);
        booksMap.put("book1", new Book("java", "shaina", 100));
        booksMap.put("book2", new Book("c#", "shaina", 200));
        booksMap.put("book3", new Book("c Fundamentals", "shaina", 160));
        booksMap.put("book4", new Book("c#", "shaina", 200));
        booksMap.put("book5", new Book("c Fundamentals", "shaina", 160));
    }

    public Collection<Book> listBooks(){
        return booksMap.values();
    }
    public Book findBook(String bookId)
    {
        return booksMap.get(bookId);
    }
    public int getNoOfBooks()
    {
        return booksMap.size();
    }

}