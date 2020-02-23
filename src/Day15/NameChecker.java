package Day15;

public class NameChecker {
    public static void main(String[] args) {
        String name= "Anastasiya" ;

        if (name.length() < 4){
            System.out.println("Short Name");
        }else if (name.length() >=4 && name.length() <= 11){
            System.out.println("Medium Name");
        }else {
            //if( (name.length() > 11){
            System.out.println("Longer Name");
        }
         if (name.contains("a") || name.contains("e")){
            System.out.println("Contains a or e");
        }else {
            System.out.println("I don't have both a or e in my name!");
        }
        }
    }

