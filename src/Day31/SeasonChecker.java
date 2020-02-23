package Day31;

public class SeasonChecker {
    public static void main(String[] args) {

        decideSeasonAction("Winter");
        decideSeasonAction("Summer");

        // a String variable declared and assigned value inside main method
        // it can be accessible in main method
        String mySeason = "AAA";
        decideSeasonAction(mySeason);
        System.out.println("AAA");   // you can directly pass AAA to the method
        System.out.println(mySeason); // or you can pass a variable that has value AAA to the method

    }

    /*
    Write a static method called decideSeasonAction
    It has one String parameter called season
    Inside method method:
    according to what user passed it should print correct action
     */
    public static void decideSeasonAction(String season) {
        // this season method parameter can only be accessible inside my method body
        switch (season) {
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpkin picking");
                break;
            case "Winter":
                System.out.println("Go Snowboarding");
                break;
            default:
                System.out.println("Invalid Season");


        }


    }
}
