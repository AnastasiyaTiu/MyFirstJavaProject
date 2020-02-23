package Day49;
/*
Square
					field : length
					instance methods : (implement all abstract methods)
					toString method
 */
public class Square extends Shape implements Drawable {
    int length;

    public Square(String name, int length){
        super(name);  // reusing functionality of super class
        this.length = length;
    }
    @Override
    public void calculateArea(){
        area = length*length;  // this is how we calculate area of square
    }

    public void draw(){
        System.out.println("Draw 4 equal line with 90 degree, length " + length
        + " with color " + COLOR);  // Drawable
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }


}
