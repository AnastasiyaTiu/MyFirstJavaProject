package Day47;
// Rectangle
// instance fields: width and height

// implement calculateArea method   area = height * width
// and toString method
public class Rectangle extends Shape{
    int width, height;

    public Rectangle( int width, int height){
      // I want to set the name to word Rectangle;
        // i'm reusing the functionality of super class
        // to set the name to rectangle
        super("my rectangle");
        this.width=width;
        this.height=height;
    }

    @Override
    public void calculateArea(){
        area = width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
