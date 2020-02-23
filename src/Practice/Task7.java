package Practice;

public class Task7 {
    public static void main(String[] args) {
        String email = "Arya@KingsLanding.com";
        int firstIndex = email.indexOf("@");
        String firstPart= email.substring(0, firstIndex);
        System.out.print("Part 1--> "+firstPart);

        int secondIndex=email.indexOf(".");
        String secondPart=email.substring(firstIndex+1,secondIndex);
        System.out.print("  Part 2 --> "+secondPart);

        int thirdIndex = email.length();
        String thirdPart= email.substring(secondIndex+1,thirdIndex);
        System.out.println(" Part 3 -->"+thirdPart);
    }
}
