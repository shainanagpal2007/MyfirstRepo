package com.vapasi.loops;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        int rateperhr=500;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total hrs worked in a week");
        double  hrsinweek=sc.nextInt();
       while(hrsinweek>40 || hrsinweek<1)
        {
            System.out.println("invalid");
            hrsinweek=sc.nextInt();

        }
            double salary=rateperhr*hrsinweek;
            System.out.println("totall salary is " + salary);

    }
}
