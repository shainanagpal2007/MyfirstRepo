package com.vapasi.oopsexp;

import java.util.Scanner;

public class Student {public int regNumber;
    public String firstname;
    public String lastname;


    public Student(String firstname,String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname;
    }
    public String getName() {
        return firstname +" "+lastname;
    }
    public void rentBook(Library library,String bookid)
    {
        Book  book=library.findBook(bookid);
        if(!book.isRented()) {
            book.checkout(book.studentid);
            System.out.println("Book checkout done" + "Book Title" +book.title+ "Author " +book.author);
            library.numberofbooksrented++;
        }
    }
    public void returnBook(Library library,String bookid)
    {
        library.findBook(bookid).checkin();
        System.out.println("Book has been returned");
        if(library.numberofbooksrented!=0)
        {
            library.numberofbooksrented--;
        }

    }

}
