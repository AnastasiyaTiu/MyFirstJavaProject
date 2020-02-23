package Day31;

public class DailyRoutineMethods {

    public static void wakeUp(){
        System.out.println("Open your eyes");
        System.out.println("Close it again");
        System.out.println("Hear your alarm? open it again!");
        System.out.println("============================");
    }
public static void drinkCoffee(){
    System.out.println("Put coffee in your coffee machine");
    System.out.println("Press the button Make your coffee");
    System.out.println("============================");
}

public static void practiceJava(){
    System.out.println("Open the laptop");
    System.out.println("Put on charge laptop");
    System.out.println("Check the Email with announcements");
    System.out.println("Watch video recordings");
    System.out.println("============================");
}
public static void groceryShopping(){
    System.out.println("Make a list of products that you need");
    System.out.println("Take reusable bags");
    System.out.println("Buy everything you need");
    System.out.println("============================");
}
public static void sayILOveJava300Times(){
    for (int i = 1; i <= 300; i++) {
        System.out.println("I Love Java | ");
    }
    System.out.println();
}
    public static void main(String[] args) {
      wakeUp();
      drinkCoffee();
      practiceJava();
      groceryShopping();
      sayILOveJava300Times();
        /*
        wakeUp
        drinkCoffee
        practiceJava
        groceryShopping
        cooking
        studyJava
        haveDinner
        goToSleep
      */


    }
}
