package com.vapasi.conditional;

import java.time.Year;
import java.util.Scanner;

public class Employeebonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Salary");
        double salary=sc.nextDouble();
        System.out.println("Enter year of joining");
        int yearOfService=sc.nextInt();
        int diff= (Year.now().getValue())-yearOfService;
        //double totalSalary;
       if(diff>=5)
       {
           System.out.println("Congratulations you completed " +diff+" years");
           System.out.println("You are getting 5 % bonus. Your total salary is " + (salary+5*salary/100));
           System.out.println("total bonus amount is " + 5*salary/100);
       }
       else
       {
           System.out.println("Sorry No bonus.Your total salary is " + salary);
       }
    }


}
