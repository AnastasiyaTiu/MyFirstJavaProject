package Day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {
        String message = "     RELP IS COMING!       ";

        System.out.println(message);
        System.out.println("message character count is "+ message.length() );
// TRIM method is used to take out space on two sides NOT in between!!!
        System.out.println(message.trim() );
        System.out.println(message);

        System.out.println("message character count is "+ message.length() );

        System.out.println(  message.isEmpty()  );
    }
}
