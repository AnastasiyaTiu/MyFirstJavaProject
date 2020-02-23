package Day39;

public class Car {
    /*
    Create a Car Object template by creating a Car class
	it  has these attributes
		year , model , make , color
Create few object out of it with field value set (edited)
     */
    String model;
    String make;
    int year;
    String color;
    // or in one shot
    //String model , make, color

    // instance methods are tied to the object
    // it does not have  static keyword
    // we need an object when we call them

    public void goForward() {

        System.out.println(make + " Going forward");
    }
        // Create a method to print how old is this car
        public void printCarAge(){
            System.out.println("car age : " + (2020 -year));
    }
    //Create a method to change the color
    public void changeColorTo(String newColor){
       // Write the bunch of code here to validate
        // user is actually passing correct color
        // for example Red, Blue is valid color
        //         ABC , EFG is not valid color
        color = newColor;
    }
}
