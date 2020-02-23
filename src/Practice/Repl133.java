package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Repl133 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.
        int x =0;
        while (decimal > 0){
            binary[x] = decimal % 2;
            decimal= decimal / 2;
            x++;
        }

        for(int j = x-1; j >= 0; j--){

        }
       // int[] binary1 = new int[j];
        //System.out.println(Arrays.toString(binary1));
    }
}
