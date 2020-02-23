package Day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {

        //this is passing the array object directly into the method
        printArrayItems(   new int[]{1,6,5,3,12,3}  );
        //this is assigning the array object into a variable
        // and then pass it into the method
        int[] scores = {2,5,8,23,4,5,6};
        printArrayItems(scores);
        printMaxOfIntArray(scores);
        printMinOfIntArray(scores);
        printSumOfIntArray(scores);
    }
    // printArrayItems
    // create a method that has on e int array as a parameter
    //print out each item in this format
    // arrays has items : ---> all the items here

    public static void printArrayItems(  int[] nums  ){

        System.out.println("Arrays have items " + Arrays.toString(nums));

    }

    //printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array
public static void printMaxOfIntArray(int [] maxNum){
    int max = maxNum[0];

    for (int i = 0; i < maxNum.length; i++) {
        if(max < maxNum[i]){
            max = maxNum[i];
        }
    }
    System.out.println("max number: "+ max);

}

//printMinOfIntArray
    // this method has one int array as parameter
    // and it will print the min number inside the array
public static void printMinOfIntArray(int [] minNum){
    int min = minNum[0];

    for (int i = 0; i < minNum.length; i++) {
        if(min > minNum[i]){
            min = minNum[i];
        }
    }
    System.out.println("min number: "+ min);

}

    //printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum number inside the array
public static void printSumOfIntArray(int[] sumNum ){
    int sum = 0;

    for (int eachNum : sumNum) {
        sum += eachNum;
    }
    System.out.println("max number: "+ sum);
}

    // OPTIONALLY
// checkScoresAllMoreThan60
// this method has one int array as parameter
// and it will check whether each and every numbers are more than 60
// if so print everyone passed
// if not print someone has failed
}
