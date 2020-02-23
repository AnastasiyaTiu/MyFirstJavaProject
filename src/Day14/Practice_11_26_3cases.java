package Day14;

public class Practice_11_26_3cases {
    public static void main(String[] args) {
        // if the season is
        //spring, summer, fall --> print ducks are active
        //winter --> print bear sleep;

        String season="spring";
       // (season.equals(") || season.equals("summer") ||season.equals("fall") ){
        switch(season){
        case "spring":
            System.out.println("Bear is active");
        break;
            case "summer":
                System.out.println("Bear is active");
                break;
            case "fall":
                System.out.println("Bear is active");
                break;
            case "winter":
                System.out.println("Bear is sleeping");
                break;

        }
    }
}
