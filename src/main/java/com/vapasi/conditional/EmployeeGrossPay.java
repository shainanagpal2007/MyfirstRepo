package com.vapasi.conditional;

import java.util.Scanner;

public class EmployeeGrossPay {
    public static void main(String[] args) {
        //take inpur for per hr salary
        Scanner sc =new Scanner(System.in);
        //take input for num of hrs
        System.out.println("Enter basic per hr salary");
        double basic_salary=sc.nextDouble();
        System.out.println("enter number of hrs worked per day");
        double hrs=sc.nextDouble();
        System.out.println("enter no of days worked");
        double Totalhrs=hrs*30;
        double grosspayMonthly=basic_salary*Totalhrs;
        System.out.println("total salary of employee is "+grosspayMonthly);

    }
}
