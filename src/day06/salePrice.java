package day06;

import java.util.Scanner;

public class salePrice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double regularPrice;
        double salePrice;
        double discountPercentage;

        System.out.println("What is the regular price");
        regularPrice=scan.nextDouble();
        System.out.println("What is discount rate");
        discountPercentage=scan.nextDouble();

        salePrice=(regularPrice-regularPrice*discountPercentage);

        System.out.println("Regular prise is "+regularPrice+", "+ "discount is "+discountPercentage+" and you got deal for "+salePrice+"$");


    }
}
