package day05;

import java.util.Scanner;

public class CalculatingDayinMinutes {
    public static void main(String[] args) {

        //TASK#2

        Scanner input = new Scanner(System.in);
        System.out.println("How many days to count in minutes? ");
        int day = input.nextInt();
        int minutes = day*1440;
        System.out.println(day+ " days has " + minutes + " minutes");

      //TASK#3
      /*  Create an interactive program to ask user for hourly wage
    *  and generate yearly salary
        assume that he works 2080 hour for a year.
    * */
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your hourly wage at your work? ");
        int hourlyWage = scan.nextInt();
        int yearlySalary = hourlyWage*2080;
        System.out.println("Your yearly salary is "+ yearlySalary+"$");




    }
}
