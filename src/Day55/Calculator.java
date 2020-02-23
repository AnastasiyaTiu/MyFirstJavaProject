package Day55;

public class Calculator {
    private int result;

    public Calculator minusNum(int num){
        this.result -= num;
        return this;
    }

    public void displayFinalResult(){
        System.out.println("final result = " + result);
    }

    // addNum is a method to add number to current result
    // and return same Calculator object
    // this will allow method chaining
    // obj.add(100).add(50).add(200);
    // only one object . multiple method calls with chaining
    // this is called builder pattern in Java
    public Calculator addNum(int num){
        // modify current object attribute
        this.result += num;
        // below code will create object different then the current
//        Calculator c = new Calculator();
//        return c;
        // --------------------
        // in order to just return current object after adding number
        // we can use this -->> THE CURRENT OBJECT WE ARE WORKING ON !
        // it will return the same object you used to call this method
        // it will allow method chaining using same object
        return this;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
     //   c1.addNum(100);

        c1.addNum(100)
                .addNum(200)
                .addNum(100)
                .minusNum(50)
                .displayFinalResult();

        //c1.result = - 10000;
        //System.out.println("c1.result = " + c1.result);

//         c1 = c1.addNum(100);
//         c1 = c1.addNum(200);
//         c1 = c1.addNum(100);

    }
}
