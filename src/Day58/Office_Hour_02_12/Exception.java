package Day58.Office_Hour_02_12;

public class Exception {

    public static void main(String[] args) {

        try {
            //System.out.println(9 / 0);
            int[] arr = {1, 2, 3};
            System.out.println(arr[50]);

        }catch (IndexOutOfBoundsException e ){
            System.out.println("Array index out of bound Exception is handled");

        }catch (ClassCastException e){
            System.out.println("class cast exception is handled");

        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception is handled");

        }catch (IllegalStateException e) {
            System.out.println("Illegal State exception");
        }

        System.out.println("Test completed");
    }
}
