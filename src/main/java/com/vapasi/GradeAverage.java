package com.vapasi;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of grades");
        int length = sc.nextInt();
        Double[] grades = new Double[length];
        System.out.println("Enter grades");
        double avg=0,max = Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            grades[i]=sc.nextDouble();
            avg=avg+grades[i];
            if(grades[i]>max)
            {
                max=grades[i];
            }
            if(grades[i]<min)
                min=grades[i];
        }
        System.out.println("Average of grades " + (avg/length));
        System.out.println("highest grade is " +max);
        System.out.println("lowest grade is " +min);

    }
}
