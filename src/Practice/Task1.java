package Practice;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "J";
        //int charCount=str1.length();
        if (str1.length()>1){
            System.out.println("Print the first char twice: "+str1.charAt(0)+str1.charAt(1));
        }else if (str1.isEmpty()){

            System.out.println("Empty String" + str1.isEmpty());

        }else{
            System.out.println("Print first char twice: "+str1.charAt(0)+str1.charAt(0));
        }
            }
}
