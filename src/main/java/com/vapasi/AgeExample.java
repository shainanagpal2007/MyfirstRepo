package com.vapasi;

import java.util.Scanner;

public class AgeExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take user inputs for age
        int min,max;

        System.out.println("Enter age of A");
        int ageA=sc.nextInt();
        min=max=ageA;
        String namemin="A";
        String namemax="A";
        System.out.println("Enter age of B");
        int ageB=sc.nextInt();
        if(ageB<min) {
            min = ageB;
            namemin="B";
        }
        if(ageB>max) {
            max = ageB;
            namemax="B";
        }
        System.out.println("Enter age of C");
        int ageC=sc.nextInt();
        if(ageC<min){
            min=ageC;
             namemin="C";}
        if(ageC>max){
            max=ageC;
        namemax="C";}
        if(ageA==ageB && ageB==ageC) {
            System.out.println("all are equal");
        }
        else
        {
        System.out.println(namemin +" is Youngest" + min);
        System.out.println(namemax +"is Oldest" + max);}


        //find out who is oldest and youngest using ef else
     /*   if(ageA>ageB && ageA>ageC) {
            System.out.println("A is oldest");
            if(ageB<ageC)
                System.out.println("B is youngest");
            else
                System.out.println("C is youngest");
        }
        else if(ageB>ageA && ageB>ageC)
        {
            System.out.println("B is oldest");
            if(ageA<ageC)
                System.out.println("A is youngest");
            else
                System.out.println("C is youngest");
        }
        else if(ageC>ageA && ageC>ageB)
            System.out.println("C is oldest");

        else{
            System.out.println("age is equal");}

      */


    }
}
