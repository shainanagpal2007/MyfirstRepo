package com.vapasi.Collections;

import com.vapasi.oopsexp.Book;
//import com.vapasi.inheritance.Laptop;

import java.util.*;

public class LinkedListExample {
    public static void main(String args[]){

        ArrayList<String> al=new ArrayList<String>();
        LinkedList<String> ll=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()) System.out.println(itr.next());

        //Arraylist of Book type
        ArrayList<Book> books=new ArrayList<>();
        books.add(new Book("java","shaina",100));
        books.add(new Book("c#","shaina",200));
        books.add(new Book("c","shaina",160));
        Iterator<Book> it=books.iterator();
        while(it.hasNext()) System.out.println("Book name  :- " +it.next().getTitle());



        //Store book in map
        /*Map<String,Book> booksmap=new HashMap<>();
        booksmap.put("Java",new Book("java","shaina",100,false));
        booksmap.put("C#",new Book("c#","shaina",200,true));
        booksmap.put("C",new Book("c Fundamentals","shaina",160,false));
        System.out.println("Enter book name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if(booksmap.containsKey(name)){
            Book book = booksmap.get(name);
            System.out.println("Book Found! Book Name " + book.title + " by Author = " + book.getAuthor());
            book.getAuthor();
        } else {
            System.out.println("Book does not exits.");
        }*/









    }
}
