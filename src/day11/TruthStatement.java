package day11;

public class TruthStatement {
    public static void main(String[] args) {
        int x = 55 ;

        System.out.println("---- x > 100 || x < 10 ----");
        System.out.println(x > 100 && x < 10);


        System.out.println("---- true || false || false ----");
                             //true   ||  false     ------>>true
        System.out.println(true || false || false);

        System.out.println("---- true && true && false ----");
                                    // true  && false       -------->>false
        System.out.println(true && true && false);

        System.out.println("---- x==50 || x==51 ||       x==55 ----");
                       //  false || false->False || true -->true
        System.out.println(x==50 || x==51 ||       x==55);
     // == is checking for equality; != is checking for inequality

        // check
        //x is more than 50
        //and x is not equal to 52
        // or x equal to 52
                            // true && true
                                          // true||false -->> true
        System.out.println("---- x > 50 && x != 52 || x == 57 ----");
        System.out.println(  x > 50 && x != 52 || x == 57  );


    }
}
