package com.vapasi.polymorphism;

public class Degree {
    public void getDegree()
    {
        System.out.println("I got degree");
    }
}
class Undergraduate extends Degree
{
    @Override
    public void getDegree() {
       // super.getDegree();
        System.out.println("I am undergraduate");
    }
}
class PostGraduate extends Degree
{
    @Override
    public void getDegree() {
        //super.getDegree();
        System.out.println("I am postgraduate");
    }
}
class MainClass
{
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getDegree();
        Undergraduate undergrad=new Undergraduate();
        undergrad.getDegree();
        PostGraduate postgrad=new PostGraduate();
        postgrad.getDegree();

    }
}
