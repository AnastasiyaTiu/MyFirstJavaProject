package Day50;

public abstract class Question {
    int num1, num2, answer;
    String operator;
    boolean calculated;
    String questionType = "Unknown"; // setting default value to unknown directly here to avoid null

    abstract void calculate();

     public Question( String questionType, String operator){
          this.questionType = questionType;
          this.operator = operator;
     }

    @Override
    public String toString() {
        return "The Question Type is " + questionType + " : ";
    }
}
