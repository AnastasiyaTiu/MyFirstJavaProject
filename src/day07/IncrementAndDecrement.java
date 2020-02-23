package day07;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int apple = 10;
        apple=apple+1;
        apple +=1;
        ++apple;
        System.out.println("used -- once than apple is "+ apple);

        ++ apple;
        ++apple;
        System.out.println("used ++ twice than apple is "+ apple);

        --apple;
        System.out.println("used ++ to increment and concatenate: "+         (++apple) );


        /*
         Arithmetic operators : +-*/
        /*
        Remainder or Modulus is the remaining part of whole number division
        10%3=1—> 3*3+1=10
        10%3=1—>3*3+1=10
        Scanner nextLine() methods:
        It will capture whole line (until user press Enter on keyboard)
        How to capture single word and save it as String—> next();
// if you have only one word , just use net() instead of nextLine();
// whole number : nextInt(), nextByte(), nextShort(),
//fractional number: nextDouble(), nextFloat():
//There is no nextChar
//boolean value—> nextBoolean(),
        The problem with mixing nextX() and nextLine()
        Whenever you use nextLine after nextX() methods, it will “accidentally”capture the “Enter keyboard press” to create the confusion of nextLine () methods is not working
        the solution is : just add another scan.nextLine() just to capture that Enter keyboard without saving it into variable
        Bottom line: Do Not Use NextLine Unless really have to capture more than one word or use above technic to fix the issues.
                Shorthand /Compound Operator
                +=, -=, *=, /=, %= No space between
        int score = 10;
        score = score + 4;
        score += 4; // 14
        score *= 3; // 42
        score /= 2;  // 21
        score %= 5; // 5*4+1=21—> remainder is 1
        The special case of increasing/decreasing numbers by 1;
        incremented decrement operator come in : ++—
        int offer = 2;
        offer +=1; //3
        ++ offer;  //4 ++ will increase the number variable by 1 in shortcut
        ++ is called increment operator
        it’s very different from just +, because it takes two numbers and add them
                ++ will take one number variable and increase the value by 1
        5+7 =12; good
        5++7 —> Error
        score++—> good ! increment the score by 1
                ++— can only be used for one number variable
                */

    }
}
