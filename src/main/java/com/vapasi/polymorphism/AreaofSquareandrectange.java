package com.vapasi.polymorphism;

import java.awt.geom.Area;

public class AreaofSquareandrectange {
    public void CalculateArea(int side)
    {
        System.out.println("Area of square is " + (side*side));
    }
    public void CalculateArea(int length,int breadth)
    {
        System.out.println("Area of rectangle is " + (length*breadth));

    }

    public static void main(String[] args) {
        AreaofSquareandrectange obj=new AreaofSquareandrectange();
        //area of square
        obj.CalculateArea(30);
        //area of rectangle
        obj.CalculateArea(10,20);
    }
}
