package Day21;

public class NameBreaker {
    public static void main(String[] args) {
        String name = "Anastasiya";



        for (int i = 0; i <=  name.length() ; i++) {
            char currentChar = name.charAt(i);

            if (currentChar == 's'){
                System.out.println("Found it !!!");
                break;
            }
            System.out.println(currentChar);
        }

        for (int i = 0; i <= name.length() ; i++) {
            String currentChar = name.substring(i, i+1);

            if (currentChar.equalsIgnoreCase("t")){
                System.out.println("Found It!!!");
                break;
            }
            System.out.println(name.substring(i, i+1));
        }


        // OPTIONALLY CHAIN THE METHOD WITHOUT SAVING EACH CHAR

        for (int x = 0; x < name.length(); x++) {
        if (name.substring(x, x + 1).equalsIgnoreCase("i")) {

        System.out.println("FOUND IT !!");
       break;

            }
       System.out.println(name.substring(x, x + 1));



        }
    }
}
