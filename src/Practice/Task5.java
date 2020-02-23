package Practice;

public class Task5 {
    public static void main(String[] args) {
        String name= "Mrs . Tiunova";
        if (name.startsWith("Dr ")) {
            System.out.println("Doctor");
        }else if (name.startsWith("Mr ")){
            System.out.println("Male");
        }else if (name.startsWith("Miss ")) {
            System.out.println("Single female");
        }else if (name.startsWith("Mrs ")) {
            System.out.println("Married female");
        }
    }
}
