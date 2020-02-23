package day06;
import java.util.Scanner;
public class Person {


        public static void main(String[] args) {
            //Enter your code here
            Scanner scan= new Scanner(System.in);
            System.out.println("Welcome to the patient portal!");
            System.out.println("Please enter your personal information");

            System.out.println("Enter your first name ");
            String firstName=scan.next();


            System.out.println("Enter your last name ");
            String lastName=scan.next();


            System.out.println("Enter yor email ");
            String email =scan.next();

            System.out.println("Enter your street ");
            String street=scan.nextLine()+" "+scan.nextLine()+" "+scan.nextLine()+" "+scan.nextLine();

            System.out.println("Enter your city ");
            String city=scan.nextLine();

            System.out.println("Enter your state ");
            String state=scan.nextLine();


            System.out.println("Enter your zipcode ");
            int zipcode=scan.nextInt();


            System.out.println("Enter your work phone number ");
            long workPhoneNumber= scan.nextLong();


            System.out.println("Enter your personal phone number");
            long personalPhoneNumber=scan.nextLong();


            System.out.println("Enter your age");
            int age=scan.nextInt();


            System.out.println("Enter your height");
            double height=scan.nextDouble();


            System.out.println("Enter your weight");
            double weight=scan.nextDouble();


            System.out.println("Are you married?");
            boolean isMarried=scan.nextBoolean();


            System.out.println("Patient personal information");

            String fullName=firstName+", "+ lastName;
            System.out.println("Full name: "+fullName);

            String address=street+", "+city+", "+state+" "+zipcode;
            System.out.println("Address: "+address);

            String contacts="work phone number - " +workPhoneNumber+", "+"personal phone number - "+personalPhoneNumber+","+" email: "+email;
            System.out.println("Contacts: "+contacts);

            System.out.println("Age: "+ age);
            System.out.println("Height: "+height);
            System.out.println("Weight: "+weight+"pounds");
            System.out.println("Married?: "+isMarried);
        }
    }

