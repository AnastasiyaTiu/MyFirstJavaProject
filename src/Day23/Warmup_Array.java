package Day23;

public class Warmup_Array {
    public static void main(String[] args) {
        // create an int array of 7 items
        // assign values
        // 1) print out in reverse order
        // 2) store last item in a variable called lastItem
                 //print it out separately
        // 3) print the item right in the middle
        //
        // OPTIONALLY : find sum, find average, find max, find min

        int[] num = {5,25,35,45,55,65,75};
        System.out.println("Reversed order:");
        for (int numbers = num.length-1; numbers >=0 ; numbers--) {

            System.out.println("item = " + num[numbers]);
        }

        int arraySize = num.length;
        int lastItemIndex = arraySize-1;
        int lastItemValue = num[lastItemIndex];

        System.out.println("Last Item Value = " + lastItemValue);

        int middleItemIndex = arraySize/2;
        System.out.println("Middle item value = " + num[middleItemIndex]);

        int sum = 0;
        for (int x = 0; x < arraySize; x++) {
//            int currentItem = num[x];
//            sum += currentItem;
            sum += num[x];
        }
        System.out.println("sum = " + sum);

    }
}
