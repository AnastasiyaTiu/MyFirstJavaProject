package Day49;

/*
Cirlce
					field : radius
					instance methods : (implement all abstract methods)
					toString method
 */
public class Circle extends Shape implements Drawable{
    int radius;

    public Circle(String name, int radius){
        super(name);
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println("Circle Area = " + (3.14 *radius*radius));
    }
    public void draw(){
        System.out.println("Draw Circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + (3.14 *radius*radius) +
                '}';
    }

}
