package Day34;

public class StringMethod {
    public static void main(String[] args) {
       /* 1, login1 :  static void method
        it has two String method parameters
        called username and password
        (it accept 2 String object as argument when being called)
        it check whether username and password  "user" and "abc123"
        if yes
        print login successful
	else
        print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)

        */
        LoginVOID("user", "abc123");
        LoginVOID("user1", "abc123");
        LoginVOID("user", "abc1234");
        LoginVOID("user 1", "abc12335");


        boolean result = loginRETURN("user", "abc123");
        System.out.println("result = " + result);
        System.out.println("second run " + loginRETURN("aaaa", "bbb"));
        if (loginRETURN("user1", "abc123")) {
            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View The Order ");
        } else {
            System.out.println("NO SHOPPING UNLESS YOU SIGNED IN!!!!!!!!");
        }

    }


    public static void LoginVOID(String userName, String password) {
        if (userName.equals("user") && password.equals("abc123")) {
            System.out.println("Login Successful");
        } else if (!userName.equals("user") && password.equals("abc123")) {
            System.out.println("Login Failed! UserName invalid");
        } else if (userName.equals("user") && !password.equals("abc123")) {
            System.out.println("Login Failed! Password invalid");
        } else {
            System.out.println("Login Failed! Username and password invalid");
        }
    }

    public static boolean loginRETURN(String user, String password) {
        if (user.equals("user") && password.equals("abc123")) {
            return true;
        } else {
            return false;
        }

    }
}