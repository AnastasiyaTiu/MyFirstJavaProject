package Day46;

public class SQLProgrammer extends Programmer {

    // access modifier in sub class
    // can have same visibility or more visibility
    @Override
    void code() {
        System.out.println("Writing SQL Query");
    }

    @Override
    public void test() {
        System.out.println("Testing SQL Query");
    }

    public void writeSQLQuery() {
        System.out.println("Writing SQL Query");
    }
}
