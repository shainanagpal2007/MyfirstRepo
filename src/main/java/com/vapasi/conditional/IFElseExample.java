package com.vapasi.conditional;

import java.util.Scanner;

public class IFElseExample {
    public static void main(String[] args) {
        int mynumber=20;

        if(mynumber>30)
        System.out.println("my number is greater than 30");
        else
            System.out.println("my number is less than 30");
        System.out.println("out of if block");

        Scanner sc=new Scanner(System.in);
        int percentage=sc.nextInt();
        if(percentage>90)
        {
            System.out.println("Grade A");
        }
        else if(percentage>75)
        {
            System.out.println("Grade B");
        }
        else if (percentage> 65)
        {
            System.out.println("grade C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
