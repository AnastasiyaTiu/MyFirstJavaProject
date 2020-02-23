package Day26;

import java.util.Arrays;

public class StringSplitePractice {
    public static void main(String[] args) {
        String student = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";
        student = student.replace(" ", "");
        System.out.println("Students = " + student);
        String[] namesArray = student.split(",");

                //{"Abbos , Zulyar , Zhibek, Hasan," +" Muge, Orhan, Susan"};
               // Arrays.toString(student);

        System.out.println( Arrays.toString(namesArray) );
        System.out.println("Length of namesArray is " + namesArray.length);
        int studentCount = namesArray.length;

        for (int x = 0; x < studentCount ; x++) {

            String name = namesArray[x]; // Abbos // A-b-b-o-s-
            System.out.println("Spelling = " + name);
            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i) + "-" );
        }
            System.out.println();
        }

   }
}
