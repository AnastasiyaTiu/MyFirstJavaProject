package Day39;

public class SplitPractice {
    public static void main(String[] args) {

     String itemDetails = "Iphone 6s,44-,18.71";
        System.out.println("Item Details Before = " + itemDetails);
     String[] itemSplitArr = itemDetails.split(",");

     String name = itemSplitArr[0];
       // System.out.println("name = " + name);

        double price = Double.parseDouble(itemSplitArr[1]);
       // System.out.println("price = " + price);

        double monthly = Double.parseDouble(itemSplitArr[2]);
        //System.out.println("monthly = " + monthly);
        itemDetails = name + "," + price + "," + monthly;
        System.out.println("itemDetails After = " + itemDetails);

//        System.out.println("item name = " + itemDetails.split(",")[0]);
//        System.out.println("item price = " + Double.parseDouble(itemDetails.split(",")[1]));
//        System.out.println("item monthly = " + Double.parseDouble(itemDetails.split(",")[2]));

//        System.out.println("item price = " + itemDetails.itemDetails.split(",") [1]);
//        System.out.println("item monthly = " + itemDetails.itemDetails.split(",") [2]);

    }
}
