package Day22;

public class ArrayPracticeBoolean {
    public static void main(String[] args) {
        boolean[] yesNo = new boolean[3];

        System.out.println( yesNo[0] );
        System.out.println( yesNo[1] );
        System.out.println( yesNo[2] );

        yesNo[0]= true;
        yesNo[1]= false;
        yesNo[2]= 10>7; //true
        System.out.println( yesNo[0] );
        System.out.println( yesNo[1] );
        System.out.println( yesNo[2] );

    }
}
