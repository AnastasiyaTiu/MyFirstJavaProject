package Day29;

import java.util.Arrays;

public class FillingUpStringArrayValue {
    public static void main(String[] args) {
        // Create an array with size 300 and fill it up with I Love Java
       String[] love = new String[300];

        System.out.println("Before the filling up :\n " + Arrays.toString(love));
//        love[0] = 1;
//        love[1] = 2;
//        love[2] = 3;
//        .........
//        love[299] = 300;

        for (int i = 0; i < love.length; i++) {
            love[i] = (i+1)+". I love Java";


    }
        System.out.println("After the filling up : \n" +  Arrays.toString(love));
}
 }