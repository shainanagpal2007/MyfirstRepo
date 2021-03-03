package com.vapasi;

import java.util.Scanner;

public class Level2Conditional {
    public static void main(String[] args) {
        //CheckLeapyear();
        CheckPlaceofservice();
    }
    public static void CheckLeapyear()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter year");
        int year=sc.nextInt();
        // if the year is divided by 4
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }
    public static void CheckPlaceofservice()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter you age");
        int age=sc.nextInt();
        System.out.println("Enter Gender");
        String gender=sc.next();
        System.out.println("Enter Marital status");
        String mstatus=sc.next();
        if(gender.equals("F") || (gender.equals("M") && (age>=40 && age<=60)))
        {
            System.out.println("Work only in urban areas");
        }
        else if (gender.equals("M") && (age>=20 && age<=40))
        {
            System.out.println("employee can work anywhere");
        }
        else {
            System.out.println("error");
        }

    }
}
