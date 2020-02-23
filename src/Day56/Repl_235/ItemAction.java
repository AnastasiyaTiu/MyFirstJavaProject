package Day56.Repl_235;

public class ItemAction {
    public static void main(String[] args) {
        Item i1 = new OnSaleItem("Cake", 111, 2, 10.99, 50);
        System.out.println("Cake Price = " + i1.getPrice());
        System.out.println("i1 = " + i1);
    }
}
