package Day42;

public class Movie {

   private String name, type;
   private double length;

    // Default constructor:
    //  a constructor that give by compiler
    // only if you don't have any constructor in your class
    // it's invisible
    // and it has no parameter
    // it has no code inside


    public Movie(){
        System.out.println("Empty Movie");
    }

    // write a constructor to set all the fields value
    public Movie(String name, String type, double length) {
        this.name = name;
        this.type = type;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    // toString method so we can directly print out
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                '}';
    }
}
