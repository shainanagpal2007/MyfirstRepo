package com.vapasi;

public class Car {
    private String color;
    public static int numberOfCarsMade;
    //public Car(){}
    public Car(String color)
    {
        this.color=color;
    }
    public Car()
    {
        numberOfCarsMade=numberOfCarsMade+1;
    }
    public Car(Car car)
    {
        this.color=car.color;
    }

    public String getColor()
    {
        return color;
    }
    public String paintColor(String color)
    {
        return this.color;
    }

}

interface Break{
    public void typeofBreak(); // interface method (does not have a body)
     // interface method (does not have a body)
}
interface Body{
    public void Colorofbody(); // interface method (does not have a body)
    // interface method (does not have a body)
}

//hyundai implements break and body interface
class Hyundai implements Break, Body{
    @Override
    public void typeofBreak() {
        // The body of animalSound() is provided here
        System.out.println("ABC");
    }
    @Override
    public void Colorofbody() {
        // The body of sleep() is provided here
        System.out.println("Blue");
    }
}

class Main {
    public static void main(String[] args) {
        Hyundai hyundai=new Hyundai();
        hyundai.typeofBreak();
        hyundai.Colorofbody();
    }
}
