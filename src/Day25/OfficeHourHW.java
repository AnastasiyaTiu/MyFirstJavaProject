package Day25;

public class OfficeHourHW {
    public static void main(String[] args) {
        /*
        sor (variable : collection of data ) {
        statements;
        }
        variable Must be representing each elements of the collection of data

         */
        String[] fruits = {"apple","banana","grape","strawberry","blueberry","kiwi"};

        for (String eachFruit : fruits){
           char lastChar = eachFruit.charAt(eachFruit.length()-1);  // represents the last character of each string
            if (lastChar=='e'){
                System.out.println(eachFruit);

            }
        }


       // 1.8 print out only last 3 characters of all the items

        for (int i = 0; i < fruits.length ; i++) {
            String last3 = fruits[i].substring(fruits[i].length()-3);
            System.out.println(last3);
        }

        for (String eachFruit : fruits ) {
            String last3 = eachFruit.substring(eachFruit.length()-3);
         //  String last3 = "" + eachFruit.charAt(eachFruit.length()-3
           //        + eachFruit.charAt(eachFruit.length()-2))+eachFruit.charAt()
            System.out.println(last3);

        }

        float[] prices = { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };
     float max = prices[0];

        for (float eachPrice : prices ){
            if (eachPrice > max){
                max = eachPrice;
            }
        }
        System.out.println(max);

        System.out.println("===================");
        float Max = prices[0];
        for (float eachPrice : prices){
            if (eachPrice < Max){
                continue;
            }
            Max = eachPrice;
        }
        System.out.println(Max);
        System.out.println("===========================");

        // finding the second maximum number from the array
        float secondMax = prices[0]; // store the second max number

        for (float eachPrice : prices ){
            if(eachPrice > secondMax && eachPrice < max){
                secondMax = eachPrice;
            }
        }
        System.out.println(secondMax);

        //find the index number of second max number
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == secondMax){
                System.out.println("index number of " + secondMax + " is : " + i);
            }
        }
    }
}
