package com.vapasi.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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

    }
}
