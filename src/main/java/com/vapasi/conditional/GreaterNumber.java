package com.vapasi.conditional;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum=sc.nextInt();
        System.out.println("Enter second number");
        int secNum=sc.nextInt();
        if(firstNum>secNum)
            System.out.println("first number is greater" + firstNum);
        else if(secNum>firstNum)
            System.out.println("second number is greater" + secNum);
        else
            System.out.println("both numbers are equal");
    }
}
