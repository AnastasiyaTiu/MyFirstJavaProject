package Day23;

import java.util.Arrays;

public class HW {
    /*
    Create a String array of 6 items to store groceryItems

    Create a float array of 6 float values to store prices

    assume that the order of grocery Items match the prices in same order.
    Do below tasks :
            1, loop through each grocery items and print them in one line
          1.1 print each items at odd index
          1.2 print all items in reverse order
          1.3 find out the index location of strawberry
          1.4 find out the count of groceries that contains berry in the name
          1.5 print out all the character counts of the grocery items
          1.6 print out only those items with even character count
          1.7 print out only those items end with letter e
          1.8 print out only last 3 characters of all the items
          1.9 create String variable called allItems and store all the items inside array separated by comma.

     */
    public static void main(String[] args) {
        String[] groceryItems = {"apple","banana","grape","strawberry","blueberry","kiwi"};

        float[] storePrices =  { 1.99F,   0.99F,    4.65F,    3.89F,       3.88F,      2.88F  };
        System.out.print("1. Items one line : ");
        String items = groceryItems[0];
        int groceryCount = groceryItems.length;
        for (int x = 0; x < groceryCount; x++) {

            System.out.print( groceryItems[x] + " ");
        }
        System.out.println();

        System.out.print("1.1 Items at odd index : ");
        for (int x = 0; x < groceryCount; x++) {
            if (x % 2 == 1) {

                System.out.print(  groceryItems[x] + " ");
            }
        }
        System.out.println();
        System.out.print("1.2 Items in reverse order : ");
        for (int x = groceryCount-1; x >= 0; x--) {

            System.out.print( groceryItems[x] + " ");
        }
        System.out.println();

        for (int s = 0; s < groceryCount; s++) {
           String strwLocation = groceryItems[s];
           if (groceryItems[s].contains("strawberry")){
            System.out.println("1.3 The index location of strawberry is " + s);
           }
        }

        System.out.print("1.4 The count of groceries that contains berry : ");
        for (int b = 0; b < groceryCount; b++) {
            String berryLocation = groceryItems[b];
            if (groceryItems[b].contains("berry")) {
                System.out.print( b + " - " + groceryItems[b] + " ");
            }
        }
        System.out.println();
        System.out.println("1.5 All the character counts of the grocery items : ");
        for (int y = 0; y < groceryCount ; y++) {
            System.out.println(groceryItems[y] + " - " + groceryItems[y].length()+" ");
        }

        System.out.print("1.6 Items with even character count : ");
        for (int y = 0; y <= groceryCount-1 ; y++) {
            if (groceryItems[y].length()% 2 == 0){
                System.out.print(groceryItems[y] + " ");
            }
        }
        System.out.println();


        System.out.print("1.7 Items end with letter e :");
        for (int x = 0; x < groceryCount; x++) {
            String eContain = groceryItems[x];
            if (groceryItems[x].endsWith("e")) {
                System.out.print(groceryItems[x] + " ");
            }
        }
        System.out.println();

        System.out.print("1.8 Last 3 characters of all the items : ");
        for (int x = 0; x < groceryCount; x++) {
            System.out.print(groceryItems[x].substring(groceryItems[x].length()-3) + " ");
        }
        System.out.println( );
        System.out.println("1.9 Store all the items inside array separated by comma : ");
        String allItems = Arrays.toString(groceryItems);
        System.out.print(Arrays.toString(groceryItems));


    }
}
