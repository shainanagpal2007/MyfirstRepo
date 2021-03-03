package com.vapasi.conditional;

import java.util.Scanner;

public class ShopExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter quantity");
        double quantity=sc.nextDouble();
        double costPerpeice=100;
        double totalCost = costPerpeice * quantity;
        if(quantity>=1000) {
            System.out.println("You will get 10% discount");
            System.out.println("total price is" + totalCost + "And after discount"+ (totalCost-10*totalCost/100));
        }
        else
            System.out.println("No Discount");
        System.out.println("total price is" +  totalCost);

    }
}
