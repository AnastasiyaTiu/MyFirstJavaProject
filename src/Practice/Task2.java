package Practice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Create a search question");
        String searchKeyword=scan.next();

        String tabTitle = searchKeyword+ "- Google Search";
        if (tabTitle.startsWith("Java") && tabTitle.endsWith("- Google Search")){
            System.out.println("The test is passed");

        }else{
            System.out.println("FAIL!");
        }
    }
}
