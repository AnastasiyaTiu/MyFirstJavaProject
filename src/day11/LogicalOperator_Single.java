package day11;

public class LogicalOperator_Single {
    public static void main(String[] args) {
        System.out.println(7>5 && 1>7);
        System.out.println(5>5 && 1>7);
        System.out.println(1>5 && 9>7);

        System.out.println(7>5 & 1>7);
        System.out.println(5>5 & 1>7);
        System.out.println(1>5 & 9>7);

        // combine the result of checking 5 is more than 10 and 9 divided by 0 is 3
        System.out.println("---- 5>10 &&  9/0==3  ----");
                           // false
        System.out.println(   5>10 &&  9/0==3  );

       // System.out.println(   5>10  &  9/0==3  );  // will be ERROR
    }
}
