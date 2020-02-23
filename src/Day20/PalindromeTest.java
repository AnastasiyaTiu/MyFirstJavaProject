package Day20;

public class PalindromeTest {
    public static void main(String[] args) {
        // if you
        //

        // level , kayak, elle, madam, aziza

        String name = "Kayak";
        System.out.println("name = "+ name);

        String reversedName="";

        for (int i = name.length()-1; i >=0 ; i--) {
            reversedName += name.charAt(i);
        }

        System.out.println("reversedName = " + reversedName);

        // Check whether reversed name is equal without case checking
        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("PALINDROME TEST HAS PASSED");
        }else{
            System.out.println("PALINDROME TEST HAS FAILED");
        }
    }
}
