package day05;

import java.util.Scanner;

/*
    Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>

        Your grand total for this shopping is ????

    * */

public class GroceryActions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price for tomato per pound? ");
        float priceTomato = scan.nextFloat();
        System.out.println("How many pounds of tomato you want to buy?");
        int tomatoPounds=scan.nextInt();
        float totalT= priceTomato*tomatoPounds;
        System.out.println("Your total price for " +tomatoPounds+ " pounds of tomatos is "+ totalT +" $.");

        System.out.println("What is the price for potato per pound?");
        float potatoPrice=scan.nextFloat();
        System.out.println("How many pounds of potato you want to buy?");
        int potatoCount=scan.nextInt();
        float totalP=potatoPrice*potatoCount;
        System.out.println("Your total price for potato is "+ totalP + " $." );

        System.out.println("What is the price for Bananas per pound? ");
        float priceBananas=scan.nextFloat();
        System.out.println("How many pounds of bananas would you like? ");
        int poundBabanas=scan.nextInt();
        float totalB= priceBananas*poundBabanas;
        System.out.println("Your total price for " + poundBabanas+ " pounds of Bananas is "+ totalB + " $.");

        float checkPrice= totalT+totalP+totalB;

        System.out.println("Your total Check is " + checkPrice + "$");




    }
}
