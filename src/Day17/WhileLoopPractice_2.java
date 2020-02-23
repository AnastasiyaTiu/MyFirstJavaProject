package Day17;

public class WhileLoopPractice_2 {
    public static void main(String[] args) {
        // skip counting by 3 from 0 till 30
        // 3 6 9 12 15 18 21 24 27 30

        int counter = 0;
        while (counter <= 30) {
            counter+=3;
            System.out.print(counter + " ");
            System.out.println();
        }

        int counterEvenNumber = 0;
        System.out.println("EVEN Number ");
        while (counterEvenNumber <= 50) {
            counterEvenNumber+=2;
            System.out.print(counterEvenNumber + " ");
        }
        System.out.println("-------------------");
        int cnt2 = 1;
        System.out.println("ODD Number ");
        while (cnt2 <= 50) {

            System.out.print(cnt2 + " ");
            cnt2+=2;
        }

        System.out.println("----------");
        int cnt3 = 0;

        while (cnt3 <= 50) {
            if (cnt3 % 2 == 0) {
                System.out.println(cnt3 + " is even number");
            } else {
                System.out.println(cnt3 + " is odd number");
            }
            ++cnt3;

        }
    }

}
