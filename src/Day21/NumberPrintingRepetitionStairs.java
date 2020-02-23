package Day21;

public class NumberPrintingRepetitionStairs {
    public static void main(String[] args) {
       /*
       1234  // count from 1 to 4
       1234      count from 1 to 4
       1234       count from 1 to 4
       1234        count from 1 to 4
       1234         count from 1 to 4

       do this 5 times

       1               count from 1 to 1
       12              count from 1 to 2
       123             count from 1 to 3
       1234            count from 1 to 4
       12345           count from 1 to 5
        */


        for (int x = 1; x <= 10; x++) {

        for (int i = 1; i <= x; i++) {

                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int y = 10; y >= 1; y--) {

            for (int z = 1; z <= y; z++) {

                System.out.print(z + " ");
            }
            System.out.println();
        }
    }
    }

