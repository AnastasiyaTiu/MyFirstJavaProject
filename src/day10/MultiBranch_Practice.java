package day10;

public class MultiBranch_Practice {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonald, what can I get for you?");
        int itemNumber=35;
        String order="";

        if(itemNumber==11){
            System.out.println("You have selected 11");
            order="Burger";
        } else if (itemNumber == 5) {
                System.out.println("You have selected 5");
                order="French Fry";
        }else if(itemNumber==8) {
            System.out.println("You have selected 8");
            order ="Nuggets" ;
        } else if(itemNumber==35) {
            System.out.println("You have selected 35");
            System.out.println("YAY!!YUM!");
            System.out.println("ENJOY!!!");
            order = " Ice Cream";
        }else{
            System.out.println("YOU HAVE SELECTED UNKNOWN ITEM NUMBER@!!");
            order="Unknown";
        }
        System.out.println("Your order is "+ order);

    }
}
