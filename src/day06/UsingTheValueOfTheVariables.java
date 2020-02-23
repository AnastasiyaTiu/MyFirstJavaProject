package day06;

public class UsingTheValueOfTheVariables {
    public static void main(String[] args) {

        int myFavoriteNumber=300;
        int yourFavoriteNumber=myFavoriteNumber;

        System.out.println("My Favorite Number "+myFavoriteNumber);
        System.out.println("Your Favorite Number "+yourFavoriteNumber);

        yourFavoriteNumber=100;
        System.out.println("My Favorite Number "+myFavoriteNumber);
        System.out.println("Your Favorite Number "+yourFavoriteNumber);

        // create a variable called yourOrder, type String and assign a value
        // optionally assign this value using Scanner
        // Create another variable called myOrder and assign the value
        //to same value as yourOrder by copying
        //and just print them out

        String yourOrder="Pizza";
        String myOrder=yourOrder;

        System.out.println("Your order "+yourOrder+"\n"+"My order "+myOrder);

    }
}
