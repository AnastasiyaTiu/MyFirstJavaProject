package Day23;

import java.util.Arrays;

public class ContainsBerriesInStringArray {

    public static void main(String[] args) {
        String[] groceryItems = {"apple","banana","grape","strawberry","blueberry","kiwi"};
        int groceryCount = groceryItems.length;
        System.out.print("1.4 The count of groceries that contains berry : ");
        for (int b = 0; b < groceryCount; b++) {
            String berryLocation = groceryItems[b];
            if (groceryItems[b].contains("berry")) {
                System.out.print( b + " - " + groceryItems[b] + " ");
            }
        }

    }
}
