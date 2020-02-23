package Day56.Office_Hour_02_10;

class Rectangle{
    public double l, w;

    public Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }

public boolean equals(Object O){
       if (O instanceof Rectangle){
           double Area1 = l*w;
           double Area2 = ((Rectangle)O).l * ((Rectangle)O).w;
                   if(Area1 == Area2){
                       return true;
                   }
       }

        return false;
}

}

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 4); // 12
        Rectangle r2 = new Rectangle(5, 3); //15

        System.out.println("r1.equals(r2) = " + r1.equals(r2));


    }
}
