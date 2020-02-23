package day11;

public class LogicalOperators {
    public static void main(String[] args) {
        // int x=70;      x>60&&<100; true
        // int x = 10;     x > 60 && x < 100; false
        // int x = 100;   x > 60 && x < 100;   false
        // int x = 99;    x > 60 && x < 100;   true

        /*
       || 2 pipe or | 1 pipe is used for compiling 2 conditions:

       If you have 2 conditions to check
       when will this will be true: as long as one ride is true, whole result will be true
       think about buying milk from 2 stores:
       as long as you found the milk in one store, you got the milk then you get out!

       How do I type pipe character on keyboard   |   —>> shift \
As long as one side is true   whole result will be true
/ *
		                          true             false
	    int x = 70 ;     x>10   ||   x < 5      —>> true
		                           false.      false
	    int x = 7 ;     x>10   ||   x < 5      —>> false
		                           true.      false
	    int x = 17 ;     x>10   ||   x < 5      —>> true
		                           false        true
	    int x = -8 ;     x>10   ||   x < 5      —>> true
         */
        System.out.println("TRUTH TABLE");
        System.out.println( "RESULT OF  true && true is " + (true && true) );
        System.out.println( "RESULT OF  false && true is " + (false && true) );
        System.out.println( "RESULT OF  true && false is " + (true && false) );
        System.out.println( "RESULT OF  false && false is " + (false && false) );

    }

    public static class ScoreChecker {
        public static void main(String[] args) {
            int score= 18 ;
            if(score < 0 || score > 100){
                System.out.println("INVALID SCORE");
            }else if (score==100){
                System.out.println("Perfect Score");
            }else if(score>70 && score<100 ){
                System.out.println("YOU HAVE PASSED!");
            }else if(score<20){
                System.out.println("COME TO MY OFFICE");
            }else if(score>30 && score<40 ){
                System.out.println("Attend additional classes");
            }else if(score>40 && score<70 ){
                System.out.println("Little bit more study will let you pass");
            }else{
                System.out.println("You have failed!!!");
            }

        }
    }
}
