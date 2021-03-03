package com.vapasi.inheritance;

import com.vapasi.inheritance.Book;
import com.vapasi.inheritance.Car;

public class Application {
    public static void main(String[] args) {
        //calling param constructor
        Car bluecar=new Car("Blue");
        System.out.println(bluecar.getColor());

        System.out.println(bluecar.paintColor("Green"));
        System.out.println(bluecar.getColor());

        //creating book object
        Book book=new Book();
        System.out.println("book price" + book.price);
        System.out.println("book title" + book.title);
        book.setTitle("Java Fundamentals");
        book.setAuthor("shaina");
        System.out.println("Number of books published \n" + Book.numberofbooks);
        System.out.println("Title of book \n" + book.title + "book author" + book.author);
        //Creating book object using parameter
        Book b1=new Book("FirstBook","shaina",200);
        System.out.println("Book is published with name \n" + b1.title+ "Price" + b1.price + "Author" + b1.author);
        b1.setPages(30);
        System.out.println("total pages " + b1.pages + "total books" + Book.numberofbooks);



    }

}
