package com.vapasi;

import java.util.Random;
import java.util.Scanner;

public class WeekArray {
    public static void main(String[] args) {
        String[] arr = new String[7];
        arr[0] = "Monday";
        arr[1] = "Tuesday";
        arr[2] = "Wednesday";
        arr[3] = "Thursday";
        arr[4] = "Friday";
        arr[5] = "Saturday";
        arr[6] = "Sunday";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int input = sc.nextInt();
        if(input>0 && input<8) {
            System.out.println("Day of week is " + arr[input-1]);
        }
        else
            System.out.println("invalid input");

    }
}