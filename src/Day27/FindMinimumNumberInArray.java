package Day27;

public class FindMinimumNumberInArray {
    public static void main(String[] args) {
/*
task 02
write a program that can find the minimum number for an array
Do NOT use sort method

write a program that can find the second minimum number for an array

write a program that can find the third minimum number for an array
 */

int[] scores = {100, -99, -1000, 2000, 5000, 0, 1, 2000};
int min = 9999999;     //min: 100
        for (int i = 0; i < scores.length; i++) {
 if ( min > scores[i] ){
      min = scores[i];
 }
        }
        System.out.println("minimum number: " + min);

        int secondMin = scores[0];
        for (int i = 0; i < scores.length ; i++) {
            if (scores[i] == min) {
                continue;
            }
            if ( secondMin > scores[i] ){
                secondMin = scores[i];
            }
        }
        System.out.println("Second minimum number is: " + secondMin);

        int thirdMin = scores[0];
        for (int i = 0; i < scores.length ; i++) {
            if (scores[i] == min || scores[i] == secondMin) {
                continue;
            }
            if (thirdMin > scores[i]) {
                thirdMin = scores[i];
            }
        }
        System.out.println("Third minimum number is: " + thirdMin);
    }
}
