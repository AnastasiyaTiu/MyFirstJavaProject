package Practice;

import java.util.Scanner;

public class Repl118 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neibouring items at a time till last item
        //write your code below
        for(int x = 0; x <= arr.length-1; x+=3){
            System.out.println(arr[x] + " , " + arr[x+1]);
        }

    }
}
