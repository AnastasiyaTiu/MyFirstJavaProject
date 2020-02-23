package Day14;

public class Practice_11_26_3 {
    public static void main(String[] args) {
        // if the season is
        //spring, summer, fall --> print ducks are active
        //winter --> print bear sleep;

        String season="winter";

        if (season.equals("spring") || season.equals("summer") ||season.equals("fall") ){
            System.out.println("Bear is active");

        }else if (season.equals("winter") ) {
            System.out.println("Bear is sleeping");
        }
    }
}
