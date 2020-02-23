package Day48;

 class data{

    private final String password = "123456";

    public String getPassword(){
        return password;
    }

    /*
    public void setPassword(String password){
        this.password = password;
    }
  */
}


public class FinalKeyword extends data{
    // final long l;
    final int a= 200 ;
    final static double b = 100;

    public static void main(String[] args) {
        final int num = 100;
        // num = 300;
        System.out.println("num = " + num);

        final String userName;
        System.out.println(b);
    }

    public void printName(){
        System.out.println("Hasan");
    }

    public final int printName(int a){
        return 10;
    }

    //        @Override
//        public void printName(){
//            System.out.println("Mohammed");
//        }
    }

