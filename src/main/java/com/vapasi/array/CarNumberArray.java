package com.vapasi.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CarNumberArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total car numbers to be generated");
        int totalnum=sc.nextInt();
        //Generate random numbers
        Random rnum=new Random();
        String[] arr = new String[totalnum];
        for(int i=0;i<totalnum;i++)
        {
            arr[i] = ("MH"+rnum.nextInt(10000));
        }
        System.out.println("Car Numbers Generated = "+ Arrays.toString(arr));
    }
}
