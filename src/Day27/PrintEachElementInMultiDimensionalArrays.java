package Day27;

import java.util.Arrays;

public class PrintEachElementInMultiDimensionalArrays {
    public static void main(String[] args) {

        // 2 dimensional array MUST contains (2-1) dimensional arrays
        //                         0          1            0          1
        String[][] names = {{"Rukhshona", "Ghoya"}, {"Hasan", "Tetiana"}};

        //print Hasan:
        System.out.println(names[1][0]);

        //print Tetiana
        System.out.println(names[1][1]);
        System.out.println(Arrays.deepToString(names));
        System.out.println("========================================");
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        //                     0           1          2           3
        // 1 2 3 4 5 6 7 8 9 10 11 12 13
        for (int i = 0; i < names.length; i++) {
            // check each index of two dimensional arrays
            //System.out.println( Arrays.toString(numbers[i]));
            for (int j = 0; j < numbers[i].length; j++) {
                // checks each elements of single dimensional array
                System.out.println(numbers[i][j]);
            }
        }
        System.out.println("==================================");

        // print
        int[][] ages = {{10}, {12, 13, 14, 16, 17}, {19, 20, 21, 22, 23}};

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
              /*  if (ages[i][j] %2 != 0){
                    continue;
                }              */
                if (ages[i][j] % 2 == 0) {
                    System.out.print(ages[i][j] + " ");
                }
            }
        }
        System.out.println("\n=============================");
        int[] arr1D = {1, 2, 3};

        for (int each : arr1D) {
            System.out.print(each);
        }
        System.out.println("\n=============================");
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80, 90, 100}};
        //                          0                         1
        for (int[] each1DArray : arr2D) {
            // variable name Char1DArray represents each index of
            for (int eachElement : each1DArray) {
                //
               // System.out.print(Arrays.toString(each1DArray));
                System.out.print(eachElement+" ");
            }
        }
    }
}
