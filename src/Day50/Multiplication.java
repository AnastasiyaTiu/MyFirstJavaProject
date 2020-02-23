package Day50;

public class Multiplication extends Question {

public Multiplication(int num1, int num2){
    super("Multiplication question", "*");
    this.num1 = num1;
    this.num2 = num2;
    }

    @Override
    public void calculate(){
    answer = num1 * num2;
    this.calculated =true;
    }

    @Override
    public String toString(){

        // How do I call toString method of super class so I can generate
        // smth like this:
        // The question type is Addition: 10+90=
        if(calculated == true){
            return super.toString() + num1 + operator + num2 + "=" + answer;
        }else{
            return super.toString() + num1 + operator + num2 + "=" ;
        }
    }

}
