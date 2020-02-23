package Day43;

public class PetStaticPractice {
    public static void main(String[] args) {
       // String str = String.valueOf(10);
        Pet.showGeneralInfo();

        // does not work
        // Pet.getName();

        Pet p1 = new Pet("cat", "yuyum");
        System.out.println("");
        p1.speak();



    }
}
