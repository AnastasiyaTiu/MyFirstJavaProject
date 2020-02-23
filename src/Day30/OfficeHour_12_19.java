package Day30;

import java.util.Arrays;

public class OfficeHour_12_19 {
    public static void main(String[] args) {
        int a = 'A';
        int[] arr = {10, (byte)9 , (short)8, 'a'};
        // data Must match
        System.out.println(Arrays.toString(arr));

        long l1 = 100;    //implicit: by default 100 is an integer, and we
        int num1 = (int)l1;  //explicit

        System.out.println(arr[arr.length-1]);    //data at last index:97

        int[] arr2 = {0, 0, 0};
        for (int each :  arr2){
            System.out.println(each);
        }
        System.out.println("============================");
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            if(i==2)
                continue;
            System.out.println(i + " is printed");
        }
        System.out.println("=========================");

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            if(i==2)
                break;  // exists the loop immediately
        }
        System.out.println("============================");

    }
}
