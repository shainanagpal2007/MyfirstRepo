package com.vapasi;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DataTypeAssignement {
    public static void main(String[] args) {
       printvalues();
      AreaOfRectangle();
      FindASCIIvalue();
       MultiplyNumbers();
        AddingIntanddouble();
        FindSquare();
        Areaandperimeter();
        ConvertFarehnitetoCelcius();

    }
public static void printvalues()
{
    //taking input in string integer double and printing them
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a string value");
    String name=sc.nextLine();
    System.out.println("Enter an integer value");
    int i=sc.nextInt();
    System.out.println("Enter a double value");
    double d=sc.nextDouble();
    System.out.println("Enter a character");
    char c=sc.next().charAt(0);
    System.out.println("string is " + name + " \n integer is " + i+ "\n double is " + "\n char is " +c);
}
public static void AreaOfRectangle()
{
    //calculating area of rectangle
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length");
      double length=sc.nextDouble();
     System.out.println("Enter breadth");
     double breadth=sc.nextDouble();
     System.out.println("Area of rectangle is " + (length*breadth));

}
    public static void MultiplyNumbers()
    {
        //calculating area of rectangle
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number1");
        double number1=sc.nextDouble();
        System.out.println("Enter number2");
        double number2=sc.nextDouble();
        System.out.println("Area of rectangle is " + (number1*number2));

    }
    public static void FindASCIIvalue()
    {
        char ch='h';
        int castAscii = (int) ch;
        System.out.println("ascii value of character 'h' is " + castAscii);
        double db=100.235;
        int i=(int)db;
        System.out.println("value of integer is " + i);
        char c='d';
        int asciival=(int)ch;
        System.out.println(asciival + "and " + (asciival+3));

    }
    public static void AddingIntanddouble()
    {
        int num1 = 5;
        double db= 6.2;
        System.out.println("sum is" + (num1+db));

    }
    public static void FindSquare()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        double number1=sc.nextDouble();
        System.out.println("square of the number is " +(number1*number1));
    }

    //use of operators
    public static void Areaandperimeter()
    {
        double length=5;
        double breadth=7;
        double num=10;
        System.out.println("Area of rectangle is " + (length*breadth) +" Perimeter of rectangle is " + (2*(length+breadth)));
        System.out.println("Perimeter of triangle is " + (length+breadth+num));

    }
    public static void ConvertFarehnitetoCelcius()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter temperature in farenhite");
        double farenhite=sc.nextDouble();
        double celsius=(farenhite-32)*(0.556);
        System.out.println("Temperature in celsius is " + celsius);
    }
}
