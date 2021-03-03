package com.vapasi.inheritance;

import com.vapasi.inheritance.Polygon;

public class Rectangle extends Polygon {
    public void render()
    {
        System.out.println("rendering  rectangle...");
    }
    public void CalculateArea(int length,int breadth)
    {
        System.out.println("Area of rectangle is " + (length*breadth));

    }
}
