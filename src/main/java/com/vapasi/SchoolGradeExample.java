package com.vapasi;

import java.util.Scanner;

public class SchoolGradeExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        double marks=sc.nextDouble();
        if(marks>=90)
        {
            System.out.println("Grade A");
        }
       else if(marks>=60 && marks<80)
        {
            System.out.print("Grade B");
        }
        else if(marks>=50 && marks<60)
        {
            System.out.print("Grade C");
        }
        else if(marks>=45 && marks<50)
        {
            System.out.print("Grade D");
        }
        else if(marks>=25 && marks<45)
        {
            System.out.print("Grade E");
        }
        else
            System.out.println("Grade F");
    }
}
