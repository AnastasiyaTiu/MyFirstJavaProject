package Day50;

/*
it has one constructor to set
			num1 and num2
			it should also set questionType to "addition"
								operator to  "+"
		it should implement calculate method
		toString method in below format
			return num1 + operator +  num2  =  "" if not calculated yet
			return num1 + operator +  num2  =  answer if already calculated
 */
public class Addition extends Question{

    public Addition(int num1, int num2){
        super("addition question", "+");
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculate(){
        answer = num1 + num2;
        // if you come to this point it means you called
        // the calculate method to calculate the result
        this.calculated = true;
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
