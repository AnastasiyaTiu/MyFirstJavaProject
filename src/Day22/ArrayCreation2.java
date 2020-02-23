package Day22;

public class ArrayCreation2 {
    public static void main(String[] args) {
        int num;   //we are only declaring a variable
        num = 10;   // we are assigning a value on different line
        //creating an array in second way
        int[] ages;
               ages = new int[]{3,5,11,33,57,18};
        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);

        System.out.println("ages = " + ages);

        for (int x = 0; x < itemCount; x++) {
            System.out.println(ages[x]);
        }

        // if you do it this way: It must happen in one line together
        // int[] areaCodes = {703, 456, 567. 678}
    int[] areaCodes = { 703 , 300 , 954, 665 };
//        int[] areaCodes ;
//        areaCodes = { 703 , 300 , 954, 665 };
        //

        for (int x = 0; x < areaCodes.length; x++) {
            System.out.print(areaCodes[x] + " ");
        }
    }
}
