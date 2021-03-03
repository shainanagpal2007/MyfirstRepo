package com.vapasi.polymorphism;

public class PrintNumber {
    int number=90;
    public void println()
    {
        System.out.println("printing number..."+number);
    }
    public void println(int a)
    {
        System.out.println("printing integer..."+a);
    }
    public void print(String s)
    {
        System.out.println("printing String..."+s);
    }
    public void print(double s)
    {
        System.out.println("printing double..."+  s);
    }
    public void print(long s)
    {
        System.out.println("printing long..." + s);
    }
    public void print(int i,float f)
    {
        System.out.println("printing int ..." + i + "and and float " +f);
    }

}
class main{
    public static void main(String[] args) {
        PrintNumber pn=new PrintNumber();
        pn.println();
        pn.println(62);
        pn.print("Shaina");
        pn.print(27.987866);
        pn.print(787654443);
        pn.print(54,21.89f);

    }
}
