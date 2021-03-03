package com.vapasi;

import java.util.Arrays;
import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args)
    {
        //VerifyCase();
        //ReverseNumber();
        //FindAverage();
        //PrintStarTrianglePattern();
        //PrintBinaryPattern();
       // PrintDiamondPattern();
        //MultiplicationTable();
        //PrimeNumbers();
        //Sumofnumbers();
        ReducingFractions();
    }
    public static void VerifyCase()
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the letter");
        ch = sc.next().charAt(0);
        if(ch>=65 && ch<=90)
        {
            System.out.println("Upper");
        }
        else if(ch >= 97 && ch <= 122) {
            System.out.println("Lower");
        }
        else if(ch >= 48 && ch <= 57) {
            System.out.println("Number");
        }
        else
            System.out.println("Symbol");
    }

    public static void ReverseNumber()
    {
        int a,res=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n!=0)
        {
            a=n%10;
            res=(res*10)+a;
            n=n/10;
        }
        System.out.println("reverse of a number is "+res);
    }
    public static void FindAverage()
    {
        int n;double res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many numbers to cal avg");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter   "+n+"  numbers");
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
             for(int i=0;i<n;i++)
             {
            res =res+a[i];
             }
        System.out.println("average="+res/n);
    }
    public static void PrintStarTrianglePattern()
    {
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void PrintBinaryPattern()
    {
        int row=4;
        for(int i=row-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("1" + "0");
            }
            System.out.println("1");
        }

    }
    public static void PrintDiamondPattern()
    {
        int row, i, j, space = 1;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        space = row - 1;
        for (j = 1; j<= row; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= row - 1; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void MultiplicationTable()
    {
        int num = 24;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
    public static void PrimeNumbers()
    {
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";
        for (i = 1; i <= 100; i++)
        {
            int count=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    count = count + 1;
                }
            }
            if (count ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }

    public static void Sumofnumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of digits");
        int size = sc.nextInt();
        int myArray[] = new int[size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Elements of the array are: " + Arrays.toString(myArray));
        System.out.println("Sum of the elements of the array ::" + sum);

    }
    public static void ReducingFractions()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator");
        int n1 = sc.nextInt();
        System.out.println("Enter denominator");
        int n2 = sc.nextInt();
        int temp1 = n1;
        int temp2 = n2;
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        }
            int n3 = temp1 / n1 ;
            int n4 = temp2 / n1 ;
            System.out.print("\n Output :\n");
            System.out.print(n3 + "/" + n4 + "\n\n" );
        }

}
