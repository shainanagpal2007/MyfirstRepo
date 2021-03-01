package com.vapasi;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many guests you are expecting, we will suggest order for you");
        int count=sc.nextInt();
        int noofmediumpizza=count/2;
        //toppings
        for(int i=0; i<noofmediumpizza;i++)
        {
            System.out.println("enter topping for pizza" + (i+1));
            String topping=sc.nextLine();
            System.out.println("topping for pizza" +(i+1) + " would be " +topping);
        }
    }

}
