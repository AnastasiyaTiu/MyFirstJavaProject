package Day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFindMaxIndex_ {
    public static void main(String[] args) {


//        Create an ArrayList of String to store 12 elements.
//        Each element should contains product information separated by comma  :
//        at index 0 -->> iPhone 6s, 499 , 18.71 and so on

        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71","iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16","MacbookPro,1499.99,79.49","ThumbDrive,39.99,2.68","Beats HeadPhones,349.99,15.12",
                "Mous,79.99,8.98","Charger,39.99,4.56","iPad,429,18.31","Dyson Vacuum,399,16.25","TV,2199,89.49",
                "Apple Watch,559,21.18"));

        System.out.println("-------Task6-------");
      //Task 6 : Print all information about most expensive items.
      double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
       String maxPriceItem = "";

       for(String eachProduct : productLst){

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if(price > maxPrice){
                maxPrice = price;
                maxPriceItem = eachProduct;
            }
        }
        System.out.println("maxPriceItem = " + maxPriceItem);
         System.out.println("maxPriceItem is at index : "
                 + productLst.indexOf(maxPriceItem));
         //  System.out.println("maxPrice = " + maxPrice);
       // System.out.println("maxPriceItem = " + maxPriceItem);
       // System.out.println("\n-----Task6-----with product details");

        // above solution will not work
        // because we need the location of maxPrice not the price itself
        /* Second Version
        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        int maxPriceIndex = 0;

        for (int i = 0; i < productLst.size(); i++) {
            // this is how we get each price part of items details
            String priceStr = productLst.get(i).split(",")[1];
            // this is how we turn the priceString into double data type
            double price = Double.parseDouble(priceStr);
            if (price > maxPrice) {
                maxPrice = price;
                maxPriceIndex = i;
           }
        }
        System.out.println("maxPriceIndex = " + maxPriceIndex);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("expensive item detail = "
               + productLst.get(maxPriceIndex));

         */

    }
}
