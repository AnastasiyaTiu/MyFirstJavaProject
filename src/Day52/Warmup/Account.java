package Day52.Warmup;

public class Account implements Transferable, Comparable<Account>{

    protected String name;
    private int balance;

    // add logic to compare by balance
    @Override
    public int compareTo(Account otherAccount){

        if(this.balance > otherAccount.balance){
            return 1;
        }else if(this.balance < otherAccount.balance) {
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public void transferAll(Account otherAccount){
//        // get the balance of current account
//        // deposit to the other account
//        otherAccount.balance += this.balance;
//        // set current account balance to 0
//        this.balance = 0;
        // or optionally use the method
        otherAccount.deposit(this.balance);
        this.withdraw(this.balance);
    }

    public Account(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    // add a method called isPalindrome and return true if the name is palindrome
    // if a String is still same String after reversing it, it is regarded as Palindrome
    public boolean isPalindrome(){

        // first store it into temp and replace all the space and make it lowercase
        String nameCopy = this.name.toLowerCase().replace(" ", "");
        // we need to reverse the value then check whether they are still same String or not
        String reverseResult = "";
        for (int x = nameCopy.length() - 1; x >= 0 ; x--) {
            reverseResult += nameCopy.charAt(x);
        }
        return nameCopy.equals(reverseResult);
    }
}
