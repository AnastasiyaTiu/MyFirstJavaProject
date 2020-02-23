package Day19;

public class ForIfLoop {
    public static void main(String[] args) {
        for (int level=90; level >= 80;  level--){
            System.out.println("I'm in level " + level);
        }
        // 1 == 10 even number?  2 4 6 8 10
        for (int num =1;  num <= 10; num++){
            //10 % 2 ? 0
            if (num %2 ==0){
                System.out.println(num);  //2
            }
        }
        for (int number = 1; number <= 10; number += 2){
            System.out.println(number); // 1 3 5 7 9
        }
        //1 + 2 == 3+2 ==5 == 7 + 2 == 9+2 ==11
    }
}
