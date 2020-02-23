package Day48;

public interface Bouncible {

    //every member of interface automatically public
    // if no access modifier is given
    // all the method with no body automatically public abstract
    //void bounce();
    public abstract void bounce();

    // ALL THE MEMBERS IN INTERFACE MUST BE PUBLIC 
    // THIS IS EXCLUSIVE TO INTERFACE TYPE
    // NOWHERE ELSE YOU GET THIS AT ALL!!!!!!!
    // if we don't add any part of public static final for the field
    // all interface fields are automatically public static final
    //public static final double GRAVITY = 9.81;
    double GRAVITY = 9.81;
}
