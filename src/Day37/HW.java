package Day37;

import java.util.Arrays;
import java.util.List;

public class HW {
    public static void main(String[] args) {
        /*
        Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
        * print pass if its more than 60 fail if not
        * count how many score are more than 90
        * get the average score
        * update the values with score-grade pair
         for example
        79C , 54F, 100A, 65D, 44F , 89B , 95A
        Optionally create 4 methods according to above criteria
         */

        // this is the short way to create list that non-resizable

        //   * print pass if its more than 60 fail if not
        List<String> numLst = Arrays.asList("79" , "54" , "100", "65", "44","78","68","98" ,"89","77");
        System.out.println("numLst = " + numLst);

        for( String each : numLst) {

            int eachNum = Integer.parseInt(each);
            if (eachNum > 60) {
                System.out.println("Pass = " + eachNum);
            } else {
                System.out.println("Fail = " + eachNum);
            }
        }

        //      * count how many score are more than 90
        int count = 0;
        for(String each : numLst) {

            if (Integer.parseInt(each) > 90) {
                ++count;
            }
        }
        System.out.println("count = " + count);

        //    * get the average score

        int sum = 0;
        for(String each : numLst){
            sum += Integer.parseInt(each);
        }
        System.out.println("average = " + sum / numLst.size());
        }
    }

