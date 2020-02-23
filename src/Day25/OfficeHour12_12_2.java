package Day25;

import java.util.Arrays;

public class OfficeHour12_12_2 {
    public static void main(String[] args) {

        // write a program that can print out the unique values from an array
        int[] numbers = {1,1,2,2,3,4,4,5,5};

        for (int j = 0; j < numbers.length; j++) {

        int count =0; // find out the number of apperence
        for (int i = 0; i < numbers.length ; i++) {
           if (numbers[i] == numbers[j]){
               count++; // adds one to occurence number of 1
           }
        }

        if(count == 1) {  // if the value is unique, then we print out
         //   System.out.println(array[j]);
        }
    }
//write a program that can find the second max number from an int array

        int[] grades = {1,2,3,4,5,6,7,8};

        int max = grades[0];

        for (int    eachGrade  :  grades ){
            if (eachGrade > max){
                max = eachGrade;
            }
        }
        System.out.println(max);

        int secondMax = grades[0];
        for (int  eachGrade : grades){
            if(eachGrade == max){
                continue;
        }
            if(eachGrade > secondMax){
                secondMax = eachGrade;
            }
        }

        System.out.println("Second max Number : " + secondMax);

        // Swap two variable values without using a temporary variable

        int a = 10, b = 20;
        // expected result : a = 20, b = 10;
//        int c = a; // C = 10;
//        a = b;  //a=20;
//        b = c;   // b = c


        a = a+b;    // a = 30;
        b = a-b;   // b = 30 - 20 = 10
        a = a - b;  // a = 30 - 10 = 20
        System.out.println(a + " "+b);

        // Assignment : write program that can devide two numbers

    }
}
