package day10;

import java.util.Scanner;

public class SeasonAction1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hey what is the season!?");
        String season=scan.next();
        switch (season) {
            case "Spring":
                System.out.println("Hike! Easter, Navruz,Blossom");
                break;
            case "Summer":
                System.out.println("Swim, Vacation, BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("Black Friday, Hiking, Harvest, Halloween, Shopping");
                break;
            case "Winter":
                System.out.println("Snowboarding, Ski, Christmas, New Year");
                
        }
    }
}
