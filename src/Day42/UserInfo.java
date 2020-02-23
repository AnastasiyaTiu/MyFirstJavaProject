package Day42;

public class UserInfo {
// Attributes ==> instance

    private String userName,  //James
    passWord,
    ssn;

    public UserInfo(){    // default values for the instance variables
        setUserName("Unknown");
        setSSN("000000000");
        setPassWord("123456");
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String newName){
        this.userName = userName;
    }

    public String getSSN(){
        return  ssn;
    }

    public void setSSN(String ssn){
        this.ssn = ssn;
    }

    public String getPassWord(){
        return passWord;
    }

    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
}
