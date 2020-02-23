package Day27;

public class Multi_D_ArrayFindingMinNumber {
    public static void main(String[] args) {
        int[][] numbers = {  {  } , {   } , {  } , {   }  };

        //









        // solution 2
        int max2 = numbers[0][0];
        for (int[] each1DArray  :  numbers){
            for (int  eachInt : each1DArray){
              if (max2 < eachInt){
                  max2 = eachInt;
              }
            }
        }
        System.out.println(max2);
        //finding the minimum number
        int min = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if (min > numbers[i][j]){
                    min = numbers[i][j];
                }

            }
        }
        System.out.println(min);
        }
    }

