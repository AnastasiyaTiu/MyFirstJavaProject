package day05;

public class practice_11_14_3 {
    public static void main(String[] args) {

        //8 primitives

        // whole numbers: byte, short, int, long
        // fractional: double, float
        //logical:boolean (true false)
        //character : char (single character in single quote)

        //usually by default for whole numbers: just use int
        // Usually by default for fractional numbers: just use double
        /*
        Is String part of Primitive types? : NOOO!!!!!!!
        String is sequence of character

        char grade1 ='A';
        char grade2='%';
        char grade3 ='8';
        char grade4='m';
  */

        //Task 1:Age calculator
        //given birth year, please calculate the age

        int birthYear=2001;
        int currentYear=2019;
        int age=currentYear-birthYear;

        //I was born in year 2001, and I am 18 years old;

        //System.out.println("I was born in year"+ 2001+ ", and I am"+ (2019-2001)+ "years old");

        System.out.println("I was born in year "+ birthYear+  " , and I am "+ age+" years old" );
    }
}
