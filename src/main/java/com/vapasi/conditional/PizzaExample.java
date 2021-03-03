package com.vapasi.conditional;

import java.util.Scanner;

public class PizzaExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total order value");
        double cost=sc.nextDouble();
        System.out.println("is today your bday");
        Boolean b =sc.nextBoolean();
        if(cost>=1000 && cost <2000)
        {
            if(b)
            {
                System.out.println("Silver Member : You got extra 10 % discount");
                System.out.println("you are eligible for free delivery");
            }
            else
                System.out.println("Silver Category ");
            System.out.println("you are eligible for free delivery");
        }
        else if(cost>2000 && cost<5000) {
            double d=1000-cost;
            System.out.println("Gold Member : you got extra 15% discount");
            System.out.println("you are eligible for free delivery");
        }
        else if (cost>5000)
        {
            System.out.println("Platinum Member : you got extra 20% discount");
        }
        else
        {
            if(cost>400)
            {
                System.out.println("you are eligible for free delivery");
            }
        }
    }
}
