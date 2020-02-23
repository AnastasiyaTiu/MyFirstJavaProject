package Day35;

public class FindCountAndPrice {
    public static void main(String[] args) {

        /*

       // How much is your final checkout price
      // The count is always 3rd word
      // The price is always at 2nd word from the last
      LOGIC: split by space, parse count and price
         */
        String sentence = "I bought 3 tomato and the price was 3.14 each";
    String[] arr = sentence.split(" ");
    int count = Integer.parseInt(arr[2]);
    double price = Double.parseDouble(arr[arr.length-2]);
    double sum = count*price;
        System.out.println("sum = " + sum);

    // SECOND LOGIC IN ONE SHOT
        System.out.println("" + Integer.parseInt(arr[2])*
                Double.parseDouble(arr[arr.length-2]));
    }

}
