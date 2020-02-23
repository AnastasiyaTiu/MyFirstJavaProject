package Day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {
        Person p1 = new Person("Arafat", 34);

        Person p2 = new Person("Zhibekchach", 23);

        Person p3 = new Person("Asena", 23);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

        // compare p1 and p2 by age
        // if p1 is older print 1
        // if they are same age print 0
        // if p2 is older print -1
//        if (p1.age > p2.age) {
//            System.out.println(1);
//        } else if (p1.age == p2.age) {
//            System.out.println(0);
//        } else {
//            System.out.println(-1);
//        }


        System.out.println(p2.compareTo(p1));
        System.out.println(p2.compareTo(p3));
        // can we just directly provide Person Object new keyword
        int result = p2.compareTo(new Person("Jon Snow", 27));
        System.out.println("result = " + result);

        // print out the name of older person between p2 and p3
        // it's asked to use compareTo method we just created
//        if( p1.compareTo(p3) ==1 ){
//            System.out.println(p3.name);
//        }else{
//            System.out.println(p1.name);
//        }

        System.out.println('a' > 'c');
        System.out.println('z' > 'c');
        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("Jon Snow", 27));
        System.out.println("lst = " + lst);
       // anything we sort must be a type of comparable
        Collections.sort(lst);
        System.out.println("lst = " + lst);



    }
}
