package Practice;

public class ArrayTask_NumberTest {
    public static void main(String[] args) {
        int[] scores = {156,101,76,187,87, 110};

        String finalResult = "";

        int cntLessThan100 = 0;
        for (int eachNum: scores){

            if(eachNum <= 100) {
                System.out.println("eachNum = " + eachNum);
                cntLessThan100++;
            }
        }
        System.out.println("cntLessThan100 = " + cntLessThan100);
        if(cntLessThan100  > 0){
            finalResult = "No";
        }else{
            finalResult = "Yes";
        }
        System.out.println("finalResult = " + finalResult);
    }
}
