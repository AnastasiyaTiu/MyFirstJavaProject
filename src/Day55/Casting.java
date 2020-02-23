package Day55;

public class Casting {
    public static void main(String[] args) {

//    int x = 10;
//
//   long y = x;   // it works implicitly | automatically
//    //byte b = x;
//        byte b = (byte) x;   // need to be casted explicitly

        // POLYMORPHISM
        Object o = new Dog ("Chiwava");  // this is up-casting from type Dog to Object
                // o.bark();
        //Dog d = new Dog("acjsdjdsjgigflkm"); // this is new Object
        Dog d =  (Dog) o;  //this is down-casting from type Object to Dog
        d.bark();

        // in order to let the Dog object bark,
        // we need to refer a dog as a Dog or we don't have access

        // Creating object with object reference
        //Object o2 = new Object();
        // compile fine because Dog IS-A Object, BUT CLASS CAST EXCEPTION AT RUNTIME
        // because d2 = new Object() will NOT WORK!!!
//        Dog d2 = (Dog) o2;
//        cd2.bark();

        // when DOES CLASS CAST EXCEPTION HAPPEN
        // when we try to cast super type object to subtype
        // or when the object type IS-NOT-A your casted reference type

//        Shape s1 = new Circle ();
//        Square s2 = (Square) s1 // this will compile fine, but will throw CassCastException
                     // because we can't do Square s2 = new Circle();  CIRCLE IS NOT A SQUARE





}
 }