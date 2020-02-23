package Day48;

public class HR_Action {
    public static void main(String[] args) {

       // Employee e1 = new Employee();

        HourlyEmployee e1 = new HourlyEmployee(55, 2000, 101, "Anastasiya" );
        e1.calculateAnnualSalary();
        System.out.println("e1 = " + e1);

        HourlyEmployee e2 = new HourlyEmployee(57, 2080, 102, "Roksana" );
        e2.calculateAnnualSalary();
        System.out.println("e2 = " + e2);

        FullTimeEmployee e3 = new FullTimeEmployee(10000, 103, "Ainura" );
        e3.calculateAnnualSalary();
        System.out.println("e3 = " + e3);

        FullTimeEmployee e4 = new FullTimeEmployee(13000, 105, "Nastya" );
        e4.calculateAnnualSalary();
        System.out.println("e4 = " + e4);

        // each and every class we create, it will become a data (reference type)
    }
}
