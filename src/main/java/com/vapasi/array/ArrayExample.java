package com.vapasi.array;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        int[] num=new int[10];
        Random random=new Random();

        for(int i=0;i<num.length;i++)
        {
            num[i]=i;
        }
        for(int no:num)
        {
            System.out.println(no);
        }
    }
}
