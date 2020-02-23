package Day49;

// INTERFACE is like a contract,
// once someone sign a contract he/she will provide all the details
// that he/she must do

//AN INTERFACE IS NOT A CLASS!!!!

public interface Edible {

    // IN INTERFACE fields are automatically public static final
    // public static final field naming convention is ALL_CAPS!!!
    // You can have as many constants as ypu want
    public static final boolean IS_HUMAN_FOOD = true;

    // If a method with no-body is not defined public abstract
    public abstract void eat();
    public abstract void drink();

    // DEFAULT method was added since Java 8 to provide
    // default implementation to not break existing implementing classes
    // classed have option to use it as is
    // or override it according to their own requirements
    // the default method ONLY EXIST IN an Interface!
    // default keyword here IS NOT AN ACCESS MODIFIER!!!!!
    // A default method MUST HAVE BODY!!!
    // Implicitly
    public default void digest(){
        System.out.println("YOU IMPLEMENT THE CODE YOURSELF");
    }
}
