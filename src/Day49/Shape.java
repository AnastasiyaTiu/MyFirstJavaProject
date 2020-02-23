package Day49;
/*
Create an abstract class called Shape
		it implements Drawable interface
		it has 2 fields :  String name , double area
		abstract method calculateArea();
		Create 2 concrete Shape classes called
 */
//Abstract class is not required to implement
//abstract methods of the interface

public abstract class Shape implements Drawable {
    String name;
    double area;

    // why abstract class have constructor even we can not use it
    // it exists purely to let sub class to call and reuse the


    public Shape(String name){
        this.name = name;
    }

    public abstract void calculateArea();


}
