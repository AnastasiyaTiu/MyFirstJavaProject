package Day39;

public class Offer {
/*
Create Offer class with
instance fields :
location, company, salary , isFullTime
instance methods :
displayOfferDetails -- print all info about offers
Create 5 offer objects with your ideal offers with all details , call displayOfferDetails method on each of them
Optionally : @channel
Store them into List<Offer> then call the method.
Optionally :
Add 5000 to each offers less than 100K
 */
String location, company;
int salary;
boolean isFullTime;

public void displayOfferDetails(){
    System.out.println("Company Location: " + location +
            ". Company name: " + company + ". Salary: " + salary +
            ". Is full time: " + isFullTime);
}
public void add5000() {
    if (salary < 100000) {
        System.out.println("With Bonus : " + (salary += 5000));
    }
}
    // write a method called turnToFullTime
    public void turnToFullTime() {
        if(isFullTime ==false) {
            isFullTime = true;
        }
    }
}
