package Practice;

public class MonkeyTask {
    public static void main(String[] args) {
        int monkeyNumber = 5;
        //int count = 5;
        while (monkeyNumber >= 1) {

            System.out.println(monkeyNumber + " little monkeys jumping on the bed,");
            --monkeyNumber;
            System.out.println("One fell down and bumped his head,");
            System.out.println("Mama called the doctor and the doctor said,");
            System.out.println("No more monkeys jumping on the bed!");
        }
        System.out.println("Put those monkeys right to bed!");
    }
}
