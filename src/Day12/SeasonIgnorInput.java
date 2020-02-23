package Day12;

import java.util.Scanner;

public class SeasonIgnorInput {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your season Please!!");
         String season=scan.next();

         if (season.equals("spring")){
             System.out.println("Hiking, Navruz, Alergy Season, Cool weather!");

         } else if (season.equalsIgnoreCase("summer")){
            System.out.println("Pool, Swimming, Beach, Vacation!");

         } else if (season.equalsIgnoreCase("fall")){
             System.out.println("Barbecue, riding bike, Just Code!!! Halloween!");

         }else if (season.equalsIgnoreCase("winter")) {
             System.out.println("Code!!!Ski, sleeping, snowman!");
         }else{
                 System.out.println("Not Valid!!!!");
         }
    }
}
