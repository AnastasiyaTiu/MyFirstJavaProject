package Day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {


//        Create an ArrayList of String to store 12 elements.
//        Each element should contains product information separated by comma  :
//        at index 0 -->> iPhone 6s, 499 , 18.71 and so on

        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71","iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16","MacbookPro,1499.99,79.49","ThumbDrive,39.99,2.68","Beats HeadPhones,349.99,15.12",
                "Mous,79.99,8.98","Charger,39.99,4.56","iPad,429,18.31","Dyson Vacuum,399,16.25","TV,2199,89.49",
                "Apple Watch,559,21.18"));
//Each element should contains product information separated by comma  : at index 0 -->> iPhone 6s, 499 , 18.71 and so on
        //Task 1 : print only items name
        //This is for each version
        for(String eachProduct : productLst ){
            // we get each product , then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = eachProduct.split(",")[0];
            System.out.println("eachProduct name = " + namePart);
        }

        //This is for loop version
        for (int i = 0;  i < productLst.size() ; i++) {
            // we get each product by using get method of ArrayList in for loop
            // then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = productLst.get(i).split(",")[0];
            System.out.println("eachProduct name = " + namePart);

        }

        //Task 2 : print all the prices more than 500
        for(String eachProduct :productLst){

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if(price > 500){
                System.out.println("price = " + price);
            }
        }
        //Task 3 : print average price
        double sum = 0;
        double average = 0;
        for(String eachProduct :productLst){
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum += price;
        }
        average = sum / productLst.size();
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        //Task 4 : print all the items name that has less than 20$ monthly payment.
        for(String eachProduct : productLst){
            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (monthly < 20){
                System.out.println(name + " " + monthly);

            }
        }

       //Task 5 : Print the monthly payments of all the iPhone no matter what model.

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
        System.out.println("\n-----------Task 7 ----------");
        //Task 7 : Update Dyson price to 80% off
        // (Monthly payment (24 month) should also be calculated accordingly)
        int dysonIndex = 0; // there is only one Dyson
        for (int i = 0; i < productLst.size() ; i++) {

            if(productLst.get(i).startsWith("Dyson")){
                dysonIndex = i;
            }
        }
        System.out.println("dysonIndex = " + dysonIndex);
        String dysonDetails = productLst.get(dysonIndex);
        String name = dysonDetails.split(",")[0];
        double price = Double.parseDouble(dysonDetails.split(",")[1]);
        double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
        dysonDetails = name + "," + price * 0.2 + "," + monthly * 0.2;

        System.out.println("dysonDetails = " + dysonDetails);
        productLst.set(dysonIndex, dysonDetails);
        System.out.println("productLst = " + productLst);


        average = sum/12;
        System.out.println("\n---------Task8----------");

        //Task 8 : Count the items prices more than average price.
        int cnt =0;
        for (String eachProduct : productLst) {
        double price2 = Double.parseDouble(eachProduct.split(",")[1]);
                if(price2 > average){
                    ++cnt;
                }
    }
        System.out.println("all the items with prices more than average price : " + cnt);

        //OPTIONALLY :
       //Task 9 : Remove all the items has more than average price.
        for (int i = 0; i < productLst.size() ; i++) {
            double price2 = Double.parseDouble(productLst.get(i).split(",")[1]);
        if(price2 > average){
            productLst.remove(i);
            --i;
        }
        }
        System.out.println("product count after removing = " + productLst.size());
        // You may also store all the items with more than average into another list
        // then use remove all method: productLst.removeAll(newListHere)

        System.out.println("\n-------------Task Three ArrayList Objects---------");

        //------------------------
       //Create 3 more ArrayList objects to separately store
        // itemNames(String), prices(Double) , monthlyPayments(Double)  :

        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();

        for(String eachProduct : productLst) {

            //store the name part into ItemName list
            String name1 = eachProduct.split(",")[0];
            itemNames.add(name1);
            // store the name price into prices list
            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);
            // store the name monthlyPart into monthlyParts list
            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);
        }
            System.out.println("itemNames = " + itemNames);


    }
}
