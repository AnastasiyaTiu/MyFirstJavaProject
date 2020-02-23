package Day22;

public class LoopingThroughAnArrayReverseOrder {
    public static void main(String[] args) {

        // creating an array object with empty slot
        int[] scores = new int[4];
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;


        int itemCount = scores.length ;

        int lastItemIndex = itemCount-1;


        for (int x = 0; x >= itemCount ; x--) {
            System.out.println(scores[x]);
        }
        // how do we get the char count of a String
        String name = "Jon Snow";
        int charCount = name.length();


        // arrayVariable.length will give you the count of items

    }
}
