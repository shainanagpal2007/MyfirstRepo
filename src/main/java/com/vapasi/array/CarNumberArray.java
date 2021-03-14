package com.vapasi.array;

import org.hamcrest.core.IsNull;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CarNumberArray {
    public static <Bool> void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total car numbers to be generated");
        int totalnum=sc.nextInt();
        //Generate random numbers
        Random rnum=new Random();
        String[] arr = new String[totalnum];
        boolean[] isExist=new boolean[10000];
        for(int i=0;i<totalnum;)
        {
            int num =rnum.nextInt(10000);
            if(!isExist[num])
            {
                arr[i] = ("MH" + num);
                isExist[num]=true;
                i++;
            }
        }
        System.out.println("Car Numbers Generated = "+ Arrays.toString(arr));
    }
}
