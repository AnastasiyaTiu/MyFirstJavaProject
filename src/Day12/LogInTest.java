package Day12;

public class LogInTest {
    public static void main(String[] args) {
        String userName = "user123",
                password = "34";
        if ( userName.equals("user123") && password.equals("pass123") ){
            System.out.println("Login successful");
        }else if (!userName.equals("user123") && password.equals("pass123")){
            System.out.println("Your username is not correct");
        }else if (userName.equals("user123") && !password.equals("pass123")){
            System.out.println("Your password is not correct");
        }else{
            System.out.println("Invalid enter");
        }

    }
}
