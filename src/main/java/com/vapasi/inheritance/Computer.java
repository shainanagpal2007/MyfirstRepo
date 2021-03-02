package com.vapasi.inheritance;

public class Computer {
    private String name;
    double price;
    private String processor;
    private String ram;
    private String harddrive;
    public Computer(){}
    public Computer(String name, double price, String processor, String ram, String harddrive){
        this.harddrive=harddrive;
        this.price=price;
        this.name=name;
        this.ram=ram;
        this.processor=processor;
    }
    public void PrintDetails()
    {
        System.out.println("Name : " +name+ "\n Price : $" +price+ "\n Processor :" +processor+ "\n Ram :" +ram+ "\n HDD :" +harddrive);
    }
}
