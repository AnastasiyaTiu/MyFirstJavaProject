package Day18;

public class WhileLoopChar {
    public static void main(String[] args) {
        //           01234567890
        String name="Zehra Aygun";

        //getting each character using charAt(index)
        // generate sequential number 0 --> 10
        // is there any chance that while loop does not execute
        int x = 0;
        while(x<name.length()){
            System.out.println("index: "+ x);
            System.out.println(name.charAt(x));
            ++x;
        }



//        while (x < 15){
//            System.out.println("WOLA@");
//        }
        System.out.println("The End");
    }
}
