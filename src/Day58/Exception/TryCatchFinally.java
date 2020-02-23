package Day58.Exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before try catch");
       try{   // IF NO TRY CATCH BLOCK wil be -----> NullPointerException
            System.out.println("Hello from Try block");
            String str = null;
            System.out.println(str.length());
        }catch( Exception e ){
            System.out.println("Exception happened and caught ");
        }
        System.out.println("After try catch");


        try{   // IF NO TRY CATCH BLOCK wil be -----> NullPointerException
            System.out.println("Hello from Try block");
            String str = null;
            System.out.println(str.length());
        }catch( Exception e ){
            System.out.println("Exception happened and caught ");
        }finally {
            System.out.println("Finally block. Runs if there is exception or no exception");
        }
    }
}
