package Practice;

public class Repl101 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String sentence =  "What's the difference between java, javascript and python?";                  //scan.nextLine();
        int count1=0;
        int count2=0;
        for (int i = 0; i <= sentence.length()-6; i++) {

            if (sentence.substring(i, i + 4).equalsIgnoreCase("java")) {  //(indexOf("java"). lastIndexOf("java"));
                count1++;

            }

            // for (int x = 0; x < sentence.length()-1; x++){
            // }
            if (sentence.substring(i, i + 6).equalsIgnoreCase("python")) {        //(indexOf("python"). lastIndexOf("python"));
                count2++;
            }
        }
    if (count1 == count2){
            System.out.println("true");
            }else{
            System.out.println("false");
            }


            }
}
