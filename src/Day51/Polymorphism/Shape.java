package Day51.Polymorphism;

public abstract class Shape {

    public abstract void draw();

}
   class Triangle extends Shape{
    @Override
       public void draw(){
        System.out.println("Drawing triangle");
    }
}
    class Rectangle extends Shape{
        @Override
    public void draw(){
    System.out.println("Drawing Rectangle");
        }
    }
    class Circle extends Shape {
    @Override
    public void draw() {
    System.out.println("DRAWING CIRCLE");
        }
    }

