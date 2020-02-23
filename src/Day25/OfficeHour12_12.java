package Day25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OfficeHour12_12 {
    public static void main(String[] args) {
        int[] arr2;

        String[] names = new String[5];
        names[2] = "Hasan";
        names[4] = "Parvin";
        System.out.println(Arrays.toString(names));

        int[] nums = new int[7]; // highest index:6
        System.out.println(Arrays.toString(nums));

        char[] characters = {'a', 'b', 'c', 'd'};

        String str1 = Arrays.toString(characters);
        System.out.println(str1);

        int[] scores = {10,9,8,7,6,5,4,3};
        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));
        String[] chars = "ABCD".split("");

        System.out.println(Arrays.toString(chars));

         char[] chars2 = "Vlad".toCharArray();
        System.out.println(chars2);




    }
}
