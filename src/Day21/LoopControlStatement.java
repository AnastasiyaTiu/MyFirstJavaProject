package Day21;

public class LoopControlStatement {
    public static void main(String[] args) {

        // break
        // if line contains break reaches, the loop will stop!!!
//
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(i);
//            break;
//
//        }
         // while iterating over 1 to 10
        // break out of the loop when it's 5

//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(i);
//            if (i==5){
//                break;
//            }
//        }
        /*
        I want to keep adding money to my bank account from day 1 till day 10
        day 1
        day 2
        day 3

        however my bank account can only hold 12$
         so I need to stop adding money the moment I realize it can not hold
        the money I am about put if the sum would go over 12
         */


        int sum = 0;

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("current sum is " + sum);
            System.out.println("If I add " + i +
                    " dollar, it would be " + (sum + i) );

            //here we are checking whether after adding the next number
            // it will go over 40 or not
            // that's why we should use sum + i to see whether it will go over be

            if (sum + i > 12){
                break;   //BREAKING OUT THE LOOP
            }
            // we need to add the sum after we make sure it did not go over 40
            sum += i;

        }
        System.out.println("sum = " + sum);


        // continue
        //if line contains break reaches, the loop will skip to next iteration
        // WE CAN USE BREAK and CONTINUE for any type of loop




    }
}
