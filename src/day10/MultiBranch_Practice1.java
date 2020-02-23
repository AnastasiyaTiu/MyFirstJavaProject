package day10;

public class MultiBranch_Practice1 {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonald, what can I get for you?");
        int itemNumber=35;
        String order="";

        switch(itemNumber){
            case 11:
            System.out.println("You have selected 11");
            order="Burger";
            break;
            case 5:
                System.out.println("You have selected 5");
                order="French Fry";
            case 8:
            System.out.println("You have selected 8");
            order ="Nuggets" ;
            break;
            case 35:
            System.out.println("You have selected 35");
            System.out.println("YAY!!YUM!");
            System.out.println("ENJOY!!!");
            order = " Ice Cream";
            break;
            default:
            System.out.println("YOU HAVE SELECTED UNKNOWN ITEM NUMBER@!!");
            order="Unknown";
            break;
        }
        System.out.println("Your order is "+ order);

    }
}
