package com.vapasi.conditional;
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2)
        {
            if(num1>num3)
                System.out.println(num1+ " num 1 is grater");
            else
                System.out.println(num3+ " num 3 is grater");
        }
        else
        {
            if(num2>num3)
                System.out.println(num2+ " num 1 is grater");
            else
                System.out.println(num3+ " num 3 is grater");
        }
    }
}
