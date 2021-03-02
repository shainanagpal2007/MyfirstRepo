package com.vapasi;

abstract interface DisplayAllBooks {
    // public, static and final

    final int numberofBooks = Book.numberofbooks;
    // public and abstract
    void display();
}

public class Library implements DisplayAllBooks {

    Staff s = new Staff(4, 2, "Admin");


    @Override
    public void display() {
        System.out.println("Total number of books in library" + numberofBooks);
    }
}