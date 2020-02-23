package Day39;

public class Class_VariableCategory {
    public static void main(String[] args) {
        // how do we create an object out of template
        Student s1 = new Student();
        // set the value for s1 object attribute
        s1.name = "Karina";
        s1.age = 18;
        s1.gender = 'F';
      // get the value for s1 object attribute
        System.out.println("s1 name " + s1.name);

        Student s2 = new Student();
        s2.name = "Juma";
        s2.age = 31;
        s2.gender = 'M';

        System.out.println("s2 age " + s2.age);
        // I want to save Juma's age before I change so I still have access
        int oldAge = s2.age;

        s2.age = 28;
        System.out.println(s2.name + " | " + s2.age + " | " + s2.gender);

        System.out.println("Jama's old Age = " + oldAge);
        // tell me the difference between old age and new age

        System.out.println("The difference is " + (oldAge - s2.age)  );

    }
}
