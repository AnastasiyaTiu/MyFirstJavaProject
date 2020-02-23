package Day48;

import java.util.Arrays;
import java.util.List;

public class HR_Stuff {
    public static void main(String[] args) {

        // Employee is abstract super type
        // HourlyEmployee and FullTimeEmployee is specific type

        // if we have Employee data type for e1 variable
        // we can write done the address of anything IS-A employee

        Employee e1 = new HourlyEmployee(55, 2000, 101, "Anastasiya" );
//        e1.calculateAnnualSalary();
//                 e1 = new FullTimeEmployee(10000, 103, "Ainura" );
//         e1.calculateAnnualSalary();

         Employee e2 = new HourlyEmployee(57, 2080, 102, "Roksana" );
         Employee e3 = new FullTimeEmployee(13000, 105, "Nastya" );

         // what is the easiest way to store these 3 objects together
        // creating a list with 3 employee objects
        List<Employee> allEmployee = Arrays.asList(e1, e2, e3);

        for(Employee eachE : allEmployee){
           // System.out.println("eachE = " + eachE);
            System.out.println("Name is : " + eachE.name);
            eachE.calculateAnnualSalary();
        }
    }
}
