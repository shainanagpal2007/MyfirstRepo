package com.vapasi.oopsexp;

//import com.vapasi.inheritance.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class College {

        static ArrayList<Book> books=new ArrayList<>();
    public static void main(String[] args) {

        Library artLibrary=new Library(2,4,8);
        Library engLibrary=new Library(3,2,1);

        //College has departments
        Department depArts=new Department(1,"Arts",artLibrary);
        Department depEngg=new Department(1,"Engineering",engLibrary);

        //College has staff
        ArrayList<Staff> staff=new ArrayList<>();
        staff.add(new Staff(34,"Sonal","Gupta"));
        staff.add(new Staff(45,"Neeraj","Jain"));
        staff.add(new Staff(25,"Sourabh","Sharma"));
        staff.add(new Staff(25,"Rakhi","Singh"));

        //Total staff Count
        System.out.println("Total Staff in Library : " +staff.size());

        //Eldest member working in library
        Collections.sort(staff,Comparator.comparing(Staff::getAge).reversed());
        System.out.println("Eldest member of staf is : " +staff.get(0).fName+ " "+staff.get(0).lName);
        //Book Counts By Department
        int enggBooks = depEngg.getLibrary().getNoOfBooks();
        int artsBooks = depArts.getLibrary().getNoOfBooks();

        int engChairCount = depEngg.getLibrary().getNoOfChair();
        int artsChairCount = depArts.getLibrary().getNoOfChair();

        //Creating Student object
        Student student=new Student("Ram","Kumar");
        student.rentBook(artLibrary,"book1");
        //below method used to return a book so commenting for now
        //student.returnBook(artLibrary,"book1");

        //Print total number of books in art and engineering library
        System.out.println("Total number of books are : " +(enggBooks+artsBooks));

        //Number of total rented Books
        System.out.println("Total rented books are : " +(artLibrary.numberofbooksrented));

        //Total Number of chairs
        System.out.println("Total chair count: " +(engChairCount+artsChairCount));



    }


}
