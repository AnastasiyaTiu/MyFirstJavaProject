package Practice;

import java.util.Scanner;

public class Case64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int charLength= word.length();

        if (charLength==1){
            System.out.println(word + word + word);

        }else if (charLength==2){
            System.out.println(word + word);
        }else if (charLength >2){

            if (charLength%2 == 1){
                int midChar = charLength/2;
                System.out.println(word.charAt(midChar));

            }else{
                int firstMidChar = charLength/2-1;
                int lastMidChar= charLength/2;
                System.out.println(word.charAt(firstMidChar) +""+
                        + word.charAt(lastMidChar));
            }
        }

    }




//    public static void main(String[] args) {
//
//        String word = "Apples";
//        //YOUR CODE HERE
//        int position1 = word.length() / 2,
//                length1 = 1;
//        int position2 = (word.length() / 2 )- 1,
//                length2 = 2;
//        if (word.length() % 2 == 1) {
//            //if (word.length()>=4){
//            System.out.println(word + " ==> " + word.substring(position1 + position1 + length1));
//
//        } else if (word.length() == 1) {
//            System.out.println(word + " ==> " + word.substring(0, 1) + word.substring(0, 1) + word.substring(0, 1));
//        }
//
//        if (word.length() % 2 == 0) {
//            //if(word.length()>=3){
//            System.out.println(word + " ==> " + word.substring(position2 + position2 + length2));
//
//
//        } else if (word.length() == 2) {
//            System.out.println(word + " ==> " + word.substring(0, 2) + word.substring(0, 2));
//        }
//    }
}
/*
int charCount= word.length();
    int indexOfMidChar = charCount/2;
    //int middle2 = (word.length()/2)-1;

    if (word.length()%2 == 0 ){ //odd number
      if (word.length()>=4){
        int indexOfFirstHalf = charCount/2 - 1;
        int indexOfSecondHalf = charCount/2;
       System.out.println(  word
       + word.charAt(indexOfFirstHalf)
       + word.charAt(indexOfFirstHalf));
      }else if (word.length()==1){
      System.out.println(word + word + word + word);
      }
}
    if (word.length()%2 == 1){   //even number
      if(word.length()>=3){
        System.out.println(word + word.charAt(indexOfMidChar));
      }else if (word.length()==2){
       System.out.println(word + word + word);
   }
    }
 */