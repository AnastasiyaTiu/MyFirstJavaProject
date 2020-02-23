package Day21;

public class SearchInString3Char {
    public static void main(String[] args) {

        String myName="Amelia, Behlia";
        int charCount = myName.length();
        System.out.println("charCount= " + charCount);
        int lastCharIndex= charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);


        System.out.println("---------- 3 chars ----------");

        for (int i = 0; i <lastCharIndex-2 ; i++) {
            String current2Chars = myName.substring(i, i + 3);


            if (current2Chars.equalsIgnoreCase("lia")){
                System.out.println("The index of an is " + i);
        }
    }
}
    }