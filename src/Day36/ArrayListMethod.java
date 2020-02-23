package Day36;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        // create an ArrayList object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

       // C.R.U.D
        //       Create, Read, Update, Delete
        // add item, read an item, read item, update the item, remove the item, check the location ...

        lst.add( 12L ); // 12L is automatically converted to new Long(12L); because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);

        System.out.println("lst = " + lst);


        // Counting items inside arrayList
        System.out.println("Counting items using lst.size() = " + lst.size() );

     // Getting items inside ArrayList object
        System.out.println("First item is: lst.get(0) = "+ lst.get(0));

   //TASK
        // GET THE SUM OF ABOVE ARRAYLIST ITEMS
        long sum = 0;
        for (int i = 0; i < lst.size() ; i++) {
            sum+=lst.get(i); //   i in here is index, so it's data type int

        }
        System.out.println("Sum of ArrayList = " + sum);
    }
}
