   package Day60;

   import java.io.FileNotFoundException;
   import java.io.IOException;
   import java.nio.file.Files;
   import java.nio.file.Paths;
   import java.util.List;

   public class DangerZoneAgain2 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("The Start");

        readMyFile();

        Thread. sleep(3000);
        System.out.println("The end");
    }
    // document this method to tell the caller, the file
    // you are about to read might not exist
    // and handle the consequences yourself
    // the exception type already exists for this type of situation
    // is called FileNotFoundException from java.util package

       // FileNotFoundException extends IOException
    public static void readMyFile(){

        System.out.println("Reading the file in my computer");
        try {
            // we are throwing a checked exception
            // so It MUST be handled or declared,
            // here we choose to handle it with try catch
            throw new FileNotFoundException("Kaboom! file is not here!!!");
//            List<String> allLines = Files.readAllLines(Paths.get("Heroes.txt"));
//            System.out.println("allLines = " + allLines);
       // } catch (IOException e) {
        } catch (FileNotFoundException e) {
            System.out.println("AHA! Caught you in readMyFile !!!");
        }
    }

       /**
        * Files is a class coming from import java.nio.file package;
        * it has lots of file related utility
        * readAllLines static method is easiest way to read a text file (including cvs file)
        * It accepts a file path as an argument and return all lines in a list of String
        * readAllLines method declares (document) to throw IOException
        * IOException is a checked exception -->> must be handled or declared
        *
        * // quick side bar : FileNotFoundException is sub class of IOException
        */
      }
