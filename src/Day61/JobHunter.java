package Day61;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class JobHunter {
    public static void main(String[] args) {
      Job j1 = new Job ("CA", 150000, "Apple" );
      Job j2 = new Job ("VA", 130000, "Google" );
      Job j3 = new Job ("CA", 140000, "Microsoft");
        System.out.println("j1.compareTo(j2) = " + j1.compareTo(j2));
        System.out.println("j2.compareTo(j3) = " + j2.compareTo(j3));


        List<Job> jobList = new LinkedList<>();
        jobList.add(new Job ("CA", 150000, "Apple") );
        jobList.add(new Job ("VA", 130000, "Google") );
        jobList.add(new Job ("CA", 100000, "BOfA") );
        jobList.add(new Job ("CA", 120000, "Amazon") );
        jobList.add(new Job ("CA", 140000, "Microsoft") );

        System.out.println("jobList before = " + jobList);
        // How does the sort method know how to sort???
        // It use the comparing logic provided inside
        // compareTo(Job other) method
        // then sort them accordingly
        Collections.sort(jobList);
        System.out.println("jobList after = " + jobList);

        // Comparator.reverseOrder() will give you an object wih reversed comparing logic
        Collections.sort(jobList, Comparator.reverseOrder() );
        System.out.println("jobList after 2 = " + jobList);

        // Collections.reverseOrder() will give you an object wih reversed comparing logic
        // below code will try to sort the list in reverse order from natural order
        Collections.sort(jobList, Collections.reverseOrder() );
        System.out.println("jobList after 3 = " + jobList);


        // What is the difference between Collections.reverseOrder();
        // and Comparator.reverseOrder()
        // both of them will give you an Comparator object with reversed logic
        // they are just at two different place
        // one is the static method of Comparator interface
        // another is static method of Collections class
        // no functional difference at all, they happen to have same name

         
    }
}
