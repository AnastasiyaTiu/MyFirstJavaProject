package day06;

public class CoinConverter {
    public static void main(String[] args) {


        //you have 200 cent
        // how many quarter you can get 25 c
        // how many dime you can get 10c
        //how many Nickel you can get 5c
        // how many penny you can get

        int cent = 200;

        //you have purchase candle for 0.74 cent
        //what would be your remainder

        cent -= 74; // 126 cent after spending 74 cent for candle

        int quarter = cent/25;
        int penny = cent%25;   //125/25 ----> 5, 1 is remaining

        System.out.println( quarter );
        System.out.println( penny );

        //now i want to try to calculate dime for same money I got after purchase
        // how to reset the value for cent 126 so I can calculate again

        int dime= cent/10;  // ---->> 126/10 --->>12
                    // how much penny I have after getting dime 126 % 10 -->> 6
        // creating new penny2 for not mixing with previous one
        int penny2 = cent % 10;  //---->>6
        System.out.println( dime );
        System.out.println( penny2 );









    }
}
