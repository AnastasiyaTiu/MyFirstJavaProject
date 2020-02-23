package Day58.Exception;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFindDemo {

    public static void main(String[] args) throws Exception{
        System.out.println("Before Try Catch");
        Files.readAllLines(Paths.get("file.txt"));   // NoSuchFileException: file.txt

//        try {
//            Files.readAllLines(Paths.get("file.txt"));
//        }catch(IOException e ){
//            System.out.println("Exception happened and caught!");
//        }

        System.out.println("After Try Catch");
    }
}
