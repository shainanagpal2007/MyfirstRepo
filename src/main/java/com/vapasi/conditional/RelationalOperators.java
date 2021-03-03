package com.vapasi.conditional;

import java.util.Scanner;

public class RelationalOperators {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("number 1 is greater" + (num1>num2 && num1>num3));
        System.out.println("number 2 is greater" + (num2>num3 && num2>num1));

    }



}
