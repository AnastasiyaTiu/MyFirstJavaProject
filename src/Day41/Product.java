package Day41;
//Make this Product a well encapsulated
// make all the instance fields private so it can only be accessible in same class
// provide public getters and setters method
public class Product {

    // this keyword can be used to refer the current object
    // we are working on
    // we can use it to refer the instance field
    // this.fieldName
    // only can be used inside instance method (and later constructor)
   private String name;
   private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//    public String getName(){
//        return this.name;
//        // return name;
//    }
//
//    public void setName(String newName){
//        this.name = newName;
//       // name = newName;
//    }
//
//    public double getPrice(){
//        return this.price;
//    }
//
//    public void setPrice(double newPrice){
//        if (newPrice > 0){
//            this.price = newPrice;
//        }
//    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
