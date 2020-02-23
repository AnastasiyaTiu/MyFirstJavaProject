package Day22;

public class ArrayPracticePrintEachCharacter {
    public static void main(String[] args) {
        double[] prices = new double[5];

        System.out.println(  prices[0]   );

        // can NOT print out array variable directly
        // to see what's inside
        System.out.println(prices);

        prices[0] = 2.46;
        prices[1] = 12.96;
        prices[2] = 992.1;
        prices[3] = 500;
        prices[4] = 65.123;
        // what happen if I go over the range
       // RUN TIME ERROR!!!
        // prices[5] = 165.3;

        System.out.println( prices[0] );
        System.out.println( prices[1] );
        System.out.println( prices[2] );
        System.out.println( prices[3] );
        System.out.println( prices[4] );

        //create a char array that hold all the letter from your first name
        // and assign values using each characters of your first name
        char[] firstName = new char[10];
        // What default value do we get for char array
        // we get a char represented by ascii code 0
        System.out.println("<" + firstName[0] + ">");

        // then print out each character
        firstName[0]= 'A';
        firstName[1]= 'n';
        firstName[2]= 'a';
        firstName[3]= 's';
        firstName[4]= 't';
        firstName[5]= 'a';
        firstName[6]= 's';
        firstName[7]= 'i';
        firstName[8]= 'y';
        firstName[9]= 'a';

        System.out.println( firstName[0] );
        System.out.println( firstName[1] );
        System.out.println( firstName[2] );
        System.out.println( firstName[3] );
        System.out.println( firstName[4] );
        System.out.println( firstName[5] );
        System.out.println( firstName[6] );
        System.out.println( firstName[7] );
        System.out.println( firstName[8] );
        System.out.println( firstName[9] );

        // THIS WILL ACTUALLY PRINT THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
        // AND THIS IS ONLY FOR CHAR ARRAY , ANYTHING ELSE WILL PRINT MEMORY ADDRESS
        System.out.println(firstName);
    }
}
