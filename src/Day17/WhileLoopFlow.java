package Day17;

public class WhileLoopFlow {
    public static void main(String[] args) {
        int x = 10;

        // a loop condition is false then it will not even go inside the curly braces
        while (x > 100){
            System.out.println("WOLA!");
            x++;
        }
        System.out.println("THE END!!!");
    }
}
