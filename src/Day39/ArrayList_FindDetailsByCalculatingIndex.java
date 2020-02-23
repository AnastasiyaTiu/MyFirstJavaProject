package Day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_FindDetailsByCalculatingIndex {
    public static void main(String[] args) {


//        Create an ArrayList of String to store 12 elements.
//        Each element should contains product information separated by comma  :
//        at index 0 -->> iPhone 6s, 499 , 18.71 and so on

        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71","iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16","MacbookPro,1499.99,79.49","ThumbDrive,39.99,2.68","Beats HeadPhones,349.99,15.12",
                "Mous,79.99,8.98","Charger,39.99,4.56","iPad,429,18.31","Dyson Vacuum,399,16.25","TV,2199,89.49",
                "Apple Watch,559,21.18"));

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

    }
}