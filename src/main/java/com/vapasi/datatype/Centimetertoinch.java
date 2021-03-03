package com.vapasi.datatype;

import java.util.Scanner;

public class Centimetertoinch {
    public static void main(String[] args) {
        double constant = 0.394;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input in centimeter");
        double db = sc.nextDouble();
        double resultininch = constant * db;
        System.out.println("The value in inches :"+resultininch);

    }


}
