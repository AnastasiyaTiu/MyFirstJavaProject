package Day47;
// add two concrete class of Shape:
//Triangle
// inside fields: int height and base

import javax.xml.namespace.QName;

// create constructor
// to set name, height, base
public class Triangle extends Shape {
    int height;
    int base;

    public Triangle(String name, int height, int base) {
        super(name);
        this.height = height;
        this.base = base;
    }
    // implement calculateArea method   area = height * base / 2

    public void calculateArea(){
        System.out.println("Triangle area is " + this.height * this.base / 2 );
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", name=" + name +
                '}';
    }
}
