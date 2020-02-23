package Day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReviewHW {
    public static void main(String[] args) {
     Offer  offer1 = new Offer();
     offer1.location = "San Francisco";
     offer1.company = "Apple";
     offer1.salary = 120000;
     offer1.isFullTime = true;

     offer1.displayOfferDetails();

     Offer offer2 = new Offer();
        offer2.location = "Los Angeles";
        offer2.company = "Chase";
        offer2.salary = 100000;
        offer2.isFullTime = true;

        offer2.displayOfferDetails();

        Offer offer3 = new Offer();
        offer3.location = "Los Angeles";
        offer3.company = "Sprint";
        offer3.salary = 70000;
        offer3.isFullTime = false;

        offer3.displayOfferDetails();

        Offer offer4 = new Offer();
        offer4.location = "Nashville";
        offer4.company = "Bank of America";
        offer4.salary = 85000;
        offer4.isFullTime = true;

        offer4.displayOfferDetails();

        Offer offer5 = new Offer();
        offer5.location = "Beverly Hills";
        offer5.company = "Amazon";
        offer5.salary = 75000;
        offer5.isFullTime = false;

        offer5.displayOfferDetails();

        // Add 2K to the Amazon offer
        offer5.salary += 1500;
        System.out.println("New Amazon Salary = " + offer5.salary);

        // set the salary value of offer4 offer object to sum of all the offers
        offer5.salary = offer4.salary + offer4.salary + offer4.salary;
        offer5.displayOfferDetails();
        offer5.turnToFullTime();
        offer5.displayOfferDetails();


    }
}
