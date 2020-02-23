package Day59;

public class General {
    public static void main(String[] args) {

        // Object o =new String("abc");
        // can I get the first char using o
      //  System.out.println(o.charAt(0) );

        System.out.println("The Start");
        String str = null;

        // IF YOU HAVE MULTI TRY CATCH BLOCK
        // The most specific type (child type) should come first
        // the more generic type (super type) should come last
        
        try{

            System.out.println(str.charAt(0) );
            System.out.println("End of try");

        }catch (NullPointerException bla){
            System.out.println("NO object here!!!");

        }catch (Exception e){
            System.out.println( e.getMessage() );
            System.out.println("This is the rest of expressions ");
        }
        
        System.out.println("The end");
    }
}
