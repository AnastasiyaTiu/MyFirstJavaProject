package day05;

import java.util.Scanner;

public class ScannerPractice_NextBoolean {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //asking user are you recording
        System.out.println("Are you recording? ");
        boolean isRecording=input.nextBoolean();

        //The result of concatenating a string to any data type --->> String
        System.out.println("We are recording "+ isRecording);



    }

}
