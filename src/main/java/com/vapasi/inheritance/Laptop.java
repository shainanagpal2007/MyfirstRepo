package com.vapasi.inheritance;

import com.vapasi.inheritance.Computer;

public class Laptop extends Computer {


    public Laptop(String name, double price, String processor, String ram, String harddrive) {
        super(name, price, processor, ram, harddrive);
    }

    @Override
    public void PrintDetails() {
        super.PrintDetails();
        System.out.println("New Laptop Created");
    }
}

