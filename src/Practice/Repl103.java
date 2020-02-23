package Practice;

public class Repl103 {
    public static void main(String[] args) {
        String json = "\"id\": 1934, \"firstName\": \"James\", \"lastName\": \"May\", \"role\": \"student-team-member\"";

        for (int i = 0; i <= json.length()+9; i++) {
        }
       // if (json.contains("firstName")) {
            int firstNameIndexOf = json.indexOf("firstName") + 13;
            int firstNameLastIndexOf = json.indexOf("\", ");
            System.out.println("First name: " + json.substring(firstNameIndexOf, firstNameLastIndexOf));
       // }
       // if (json.contains("lastName")) {
        for (int i = 0; i <= json.length()+9; i++) {
        }
            int lastNameIndexOf = json.indexOf("lastName") + 12;
            int lastNameLastIndexOf = json.indexOf("\", ");
            System.out.println("Last name: " + json.substring(lastNameIndexOf, lastNameLastIndexOf));
      //  }
    }
}