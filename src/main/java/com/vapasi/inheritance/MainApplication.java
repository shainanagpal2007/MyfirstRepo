package com.vapasi.inheritance;

public class MainApplication {
    public static void main(String[] args) {

        Laptop lenovo=new Laptop("Lenovo",1000,"intel i7","16GB","1TB");
        lenovo.PrintDetails();
        Laptop dell=new Laptop("Dell",1500,"i3","2GB","500GB");
        dell.PrintDetails();
        Laptop sony=new Laptop("Sony",2000,"i9","8GB","1TB");
       sony.PrintDetails();

    }
}
