package Day47;

public abstract class Shape {
    String name;
    int area;

    //add a constructor to set these two value

    public Shape( String name){
        this.name = name;
    }
    // add a abstract void method called calculateArea
    public abstract void  calculateArea();

    // I want to enforce sub classes to provide toString method!!!
    public abstract String toString();

}
