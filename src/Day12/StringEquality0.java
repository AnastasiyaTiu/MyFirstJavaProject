package Day12;

public class StringEquality0 {
    public static void main(String[] args) {
        String name="AnaStasIya";
        // I want to store the result of checking name into a variable
        boolean nameCorrect=name.equals("anastasiya");
        System.out.println(nameCorrect);
        boolean nameCheckIgnoreCase=name.equalsIgnoreCase("ANASTASIYA");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println(nameCheckIgnoreCase);
        // here directly printing without saving into variable
               //           this will eventually become true or false
        System.out.println( name.equalsIgnoreCase("AnaStaSiya"));

        System.out.println(name.equalsIgnoreCase("abc"));
    }
}
