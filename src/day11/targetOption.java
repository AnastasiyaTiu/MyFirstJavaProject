package day11;

public class targetOption {
    public static void main(String[] args) {
        String targetOption = "Bd";
        switch(targetOption){
            case "Bd":
                System.out.println("You turn on bedroom light");
                break;
            case "Lr":
                System.out.println("You turn on living room light");
                break;
            case "ki":
                System.out.println("You turn on kitchen light");
                break;
            case "Ha":
                System.out.println("You turn on hallway light");
                break;
            default:
                System.out.println("Unknown");
                break;

        }
        System.out.println("");
    }
}
