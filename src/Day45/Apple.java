package Day45;

public class Apple extends Fruit {

    // FIRST LINE OF ANY CONSTRUCTOR IS AUTOMATICALLY CALLING
    // SUPER()  if we don't call any
    public Apple(){
        // I want to reuse the functionality
        // already written in super class constructor
        // we can use super() or super(arguments here)
        // to call super class's constructor
       // super();

        // how to call constructor with one argument
        super("test");

        // can we use this super() call more than once?
        // NO !!!!!!!!!!!
        System.out.println("Message from Apple Constructor");

    }

    public static void main(String[] args) {
        Apple a1 = new Apple();

    }

}
