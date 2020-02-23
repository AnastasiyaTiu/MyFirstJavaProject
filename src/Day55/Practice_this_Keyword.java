package Day55;

// we learned that super(...) always should be the first line of the constructor

// what about this(...) : used to call current class's other constructor to reuse it's code
                  // it should be always in first statement
                  // just like super(...) we can only call it once
                 // and can not be used together with super(...)
                // once this(...) is used, super() will not be added by compiler
public class Practice_this_Keyword {
    // any object created using this constructor
    // should call Practice_this_Keyword(int x) constructor with value 100
    public Practice_this_Keyword(){
        this(100);
        System.out.println("no arg constructor");
    }
    // any object you created using constructor must call no arg constructor first
    public Practice_this_Keyword(int x){
       // super();
       // this();
        System.out.println("1 arg constructor " + x);
    }
    public static void main(String[] args) {
        // line 25 --> 7-9-  15-18 - 7-10  --> done 28
        //Practice_this_Keyword t = new Practice_this_Keyword(100);
        Practice_this_Keyword t = new Practice_this_Keyword("abc");

    }

    public Practice_this_Keyword(String str){
     //   this();
        this(100);
        System.out.println("1 arg constructor with String " + str);
    }
}
