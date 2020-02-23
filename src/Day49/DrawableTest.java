package Day49;

public interface DrawableTest {

   public static void main(String[] args) {
      Circle c1 = new Circle("Circle", 6);
      c1.draw();
      c1.calculateArea();
      System.out.println(c1.toString());

      Square s1 = new Square("My precious", 10);
      System.out.println("s1 without area calculation = " + s1);
      s1.calculateArea();
      System.out.println("s1 after area calculation = " + s1);
      s1.draw();
      //System.out.println(s1.toString());
   }


}
