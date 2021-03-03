package com.vapasi.inheritance;

import com.vapasi.inheritance.Polygon;

public class Square extends Polygon {

    public void render()
    {
        System.out.println("Rendering Square");
    }
    public void print()
    {
        System.out.println("only child method");
    }
    public void CalculateArea(int side)
    {
        System.out.println("Area of square is " + (side*side));
    }

}
