package Day58.Exception;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws Exception {  // DECLARING USING THROWS KEYWORD
        System.out.println("Checked Exception in next line?");
        Thread.sleep(1000);     // <--- UNHANDLED CHECKED EXCEPTION
        System.out.println("After Thread.sleep");

//        // HANDLE USING TRY AND CATCH BLOCK
//        System.out.println("Checked Exception in next line?");
//        try {
//            Thread.sleep(1000);
//        }catch(InterruptedException e){
//            System.out.println("Exception was caught!");
//        }
//        System.out.println("After Thread.sleep");
    }
}
