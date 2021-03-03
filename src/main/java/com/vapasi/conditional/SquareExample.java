package com.vapasi.conditional;

import java.util.Scanner;

public class SquareExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        double length=sc.nextDouble();
        System.out.println("Enter the breadth");
        double breadth=sc.nextDouble();
        if(length==breadth)
            System.out.println("this is a square");
        else
            System.out.println("this is a rectangle");
        getAbsoluteValue();
    }
    public static void getAbsoluteValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int i = sc.nextInt();
        System.out.println("absolute of this number is " +Math.abs(i));
    }

}
