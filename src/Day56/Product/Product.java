package Day56.Product;
/*Create a class called Product with encapsulated fields name, price and constructor
override the .equals method coming from Object class :
Two products should be equal if they have the same fields value.
Practice Association: important
create a class called Store
It has List<Product> as instance variable
no arg constructor to initialize the list to empty ArrayList object
1 Arg constructor to accept List<Product>
First line of constructor should call nonath constructor to reuse initialization logic.
Inside constructor AddAll Products user passed to the instance variable last.
Create an instance void method called addProduct(Product p)
Create an instance void method called removeProduct(Product p)
Create an instance void method called checkIfProductExist(Product p)
Hint : just call list remove method, it will internally call .equal method to decide which one to remove
more methods : find and return max price product, Find sum.of all products
Find list of products more than average  */
public class Product extends Object{
   private String name;
   private int price;

   @Override  // require same exact method signature
   public boolean equals(Object obj){
       // down-casting from type Object to Product
       // because in order to access Product only field
       // we need to refer the object as product
       Product otherProduct = (Product) obj;
       // how to compare this name and price to whatever used passed
      return this.name.equals(otherProduct.name) && this.price==otherProduct.price;
   }

//    public boolean equals(Product otherProduct) {
//        return this.name.equals(otherProduct.name)
//                && this.price == otherProduct.price;
//    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
