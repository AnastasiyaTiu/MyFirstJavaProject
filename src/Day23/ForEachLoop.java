package Day23;

public class ForEachLoop {
    public static void main(String[] args) {

         double[] prices = {99.23, 11.99, 100.23, 99.99, 56.34};

         // for each loop syntax
        // for (dataTypeOgYourArray  variableNameForEachItem : yourArrayVariable ){
        //
        //do smth with your array items
        //}

//        for (int x = 0; x < prices.length ; x++) {
//
//            double eachPrice = prices[x] ;
//            System.out.println("eachPrice = " + eachPrice);
//        }

        // FOR EACH LOOP can only be used for array
        // there is no infinite loop ever in For Each Loop
        for (  double blalbalba : prices ) {
            System.out.println("blablabla = " + blalbalba);

        }


    }
}
