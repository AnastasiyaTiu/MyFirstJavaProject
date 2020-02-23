package Day13;

public class AmazonShipCalculater {
    public static void main(String[] args) {
        String memberType = "Regular";
        double amount = 25.99d;
        int shippingFee = 0;

        if ( memberType.equalsIgnoreCase("Prime Member") ){
            System.out.println("You get 1 day free shipping!!!");
            System.out.println( "Your final price is "+ amount );

       // }else if ( amount > 25 ){
        }else if ( ! memberType.equalsIgnoreCase("Prime member") && amount> 25 ){
            System.out.println("Not a prime member, but you order is more than 25");
            System.out.println("You got free shipping on amount "+ amount);

        }else{
            System.out.println("Do you wanna sign up for prime membership?");
            shippingFee=5;
            amount= amount+shippingFee;     //mount += shippingFee
            System.out.println("Your final amount is "+amount);
        }
    }
}
