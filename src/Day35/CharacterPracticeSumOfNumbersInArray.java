package Day35;

public class CharacterPracticeSumOfNumbersInArray {
    public static void main(String[] args) {

        // ADDITIONALLY, GET THE SUM OF THE NUMBERS INSIDE A STRING
        // optionally make it a method
        char myChar = '7';
        //get int 7
        int myNum = Integer.parseInt(myChar+ "");
        System.out.println("myNum = " + myNum);

        // Character.toString(myChar)
        // String.valueOf(myChar)

        String str = "A34B123C4X";

        char[] allChars = str.toCharArray();
        int sum = 0;
        for ( char each :allChars ){
            // checking whether each char is a number or not
            if(Character.isDigit(each)){
                // if it's print out to see
                System.out.println("each = " + each);
                //then turn it into int using parseInt method
                // parseInt only accept String
                //so we need to pass String by adding "" to each
           int eachNum = Integer.parseInt(each+"");
           //now we can numerically add the number to sum
           sum += eachNum;
            }
        }
        System.out.println("sum = " + sum);



    }
}
