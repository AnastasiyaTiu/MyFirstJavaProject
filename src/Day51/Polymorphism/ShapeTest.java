package Day51.Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

//        s1.draw();
//        s2.draw();
//        s3.draw();

        // create Array of shape to store 5 concrete Shape Object
        // and call the draw method on each of them

        // Also create ArrayList of Shape
        // and store 4 concrete Shape objects
        // and call the draw method on each of them
        System.out.println("-------------For each loop ------------");
        Shape[] allShapes = {s1,s2,s3, new Triangle(), s2 };

        for(Shape each : allShapes){
            each.draw();
        }
        System.out.println("-------------For loop------------");

        for (int x = 0; x < allShapes.length; x++) {
            allShapes[x].draw();
        }
        System.out.println("-------------For each loop with List------------");
        // Quick way to create a List --> CAN WE ADD OR REMOVE ITEM FROM THIS SHORT WAY? NO!!!
       // List<Shape> shapeList = Arrays.asList(s1,s2,s3,s2,s1);

        // this is a regular Arraylist object we can do anything with
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(s1);
        shapeList.add(s2);
        shapeList.add(s3);
        shapeList.add(s2);
        shapeList.add(s1);

        for (Shape each:shapeList ) {
            each.draw();
        }
        System.out.println("-------------For loop with List------------");
        for (int x = 0; x < shapeList.size(); x++) {
            shapeList.get(x).draw();
        }
    }
}
