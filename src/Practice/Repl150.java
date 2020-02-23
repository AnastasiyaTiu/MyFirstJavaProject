package Practice;

public class Repl150 {
    public static void printHollowRect()
    {
        int count;
        for(int x = 1; x <= 5; x++){
            System.out.print("*");
        }
        System.out.println();
        for(int y = 1; y <= 3; y++){
            System.out.println("*   *" + " ");
        }
        for(int x = 1; x <= 5; x++){
            System.out.print("*");
        }
        System.out.println();

    }


    public static void main(String[] args) {

        printHollowRect();
    }
}
