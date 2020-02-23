package Practice;
import java.util.*;
public class Repl159 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i=0; i < size; i++){
                nums[i] = scan.nextInt();
            }
            printUniqueNumbers(nums);
        }

        public static void printUniqueNumbers(int[] nums){
            //WRITE YOUR CODE HERE
            for(int x =0; x < nums.length; x++){
                int count = 0;
                for(int i =0; i < nums.length; i++){
                    if (nums[x] == nums[i] ){
                        count++;
                    }
                }
                if (count==1){
                    System.out.println(nums[x]);
                }
            }

        }
    }

