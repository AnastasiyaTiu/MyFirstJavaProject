package Day15;

public class StringCaseInsensative {
    public static void main(String[] args) {
        String name = "Arya Stark";
        System.out.println("name.contains(\"st\") Result Is: " + name.contains("st"));


        String uppercaseName = name.toUpperCase(); //ARYA STARK
        System.out.println("uppercaseName contains ST or not? "+ uppercaseName.contains("ST"));

        String lowercaseName = name.toLowerCase(); //arya stark
        System.out.println("lowercaseName contains st or not? "+ lowercaseName.contains("st"));

        // this is called method chaining, combining multiple method call
        // make my name all lowercase (String) then check whether it contains lowercase st
        // THIS WORK BECAUSE  name.toLowerCase() result in another String
        System.out.println(  name.toLowerCase().contains("st")  );

        //  System.out.println(name.length().toUpperCase());
                                 //int          String


    }
}
