package Day43;

public class StarbucksUtil {
    public static void main(String[] args) {


        Coffee c = new Coffee("Blonde", 5, 1.6);
        printCoffeeInfo(c);

        String myString = new String("Hello");
        printStringInfo(myString);
        printStringInfo("abc");

        Coffee c1 = new Coffee();
        printCoffeeInfo(c1);

        printCoffeeInfo(new Coffee("Intensito", 9)  );

        // we would need an object of current class if we wanted call
        // instance method of current class

//        StarbucksUtil util = new StarbucksUtil();
//        util.printStringInfo(myString);
    }

    /**
     * a static method print out first and last character of a String
     * @param str
     */
    public static void printStringInfo(String str){

        System.out.println("first character is " + str.charAt(0));
        System.out.println("last character is " + str.charAt(str.length()-1 )  );
    }
    /**
     * a static method to accept a coffee object and print it's information
     * like this: This coffee is: name, price is <price>, caffeine level is <level>
     *   @param co  this coffee object pass
     */
    public static void printCoffeeInfo(Coffee co){
        System.out.println("This coffee is : " + co.getType() );
        System.out.println("Price is : " + co.getPrice() );
        System.out.println("CaffeineLevel is : " + co.getCaffeineLevel() );
    }



}
