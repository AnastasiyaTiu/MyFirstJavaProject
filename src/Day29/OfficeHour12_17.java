package Day29;

public class OfficeHour12_17 {
    public static void main(String[] args) {
/*

primitive : byte short int long float double char boolean
non-primitive: Scanner String Array

 */
int number = 6;
String word = "javajjj";
// replace j --> c
        System.out.println("After replace j : " + word.replace("j", "c") );
        System.out.println(word) ;   //java
        System.out.println("word");    //word
        System.out.println(number);   // 6
        System.out.println(number+6);    //12
        //6 + 6 =12
        // in order to see how many chars we have in variable
        System.out.println("There are total " +  word.length() + " chars in word"    );
                              //  8 characters
        System.out.println("I have 6" + 7);
        System.out.println("I have 9" + 1 + 2);
        System.out.println("I have 8" + (1+4));

        System.out.println(  (2+3) + (3+5)  );

        String book = "learn java in 1 day, I love java";
        System.out.println( book.indexOf("j") );


        System.out.println(book.length() );
        //I want only one char  --> l
        System.out.println(    book.charAt(0)   );
        System.out.println("Last index of j id: " + book.lastIndexOf("j"));


        System.out.println("I'm looking for a space " + book.charAt(5)  );

        //we can use substring method to get one or more chars
        String student = "Rabia";
        System.out.println(student.length() );
                             // 5 ==> int
        int i =9;
        int lengthOfStudent = student.length();
                              //5
        //int lengthOfStudent = 5;

        System.out.println(student.substring(2));
        System.out.println(student.substring(0,1));
        System.out.println(student.substring(4));  // last a
        System.out.println(student.substring(4,5)); //last a
        System.out.println(student.toUpperCase()); //RABIA
        System.out.println(student.toLowerCase());  //rabia

        String lowerStudent = student.toLowerCase();
        System.out.println(lowerStudent);

        String batch = "Online";

        // upperCase + length
        System.out.println(batch.toUpperCase().length());
                                  //ONLINE
        System.out.println("Asiya".toUpperCase().toLowerCase().length());

        //trim





    }
}
