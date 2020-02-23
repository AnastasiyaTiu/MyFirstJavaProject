package Day62;

import Day61.Job;

import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {
    public static void main(String[] args) {

        // We want the jobs automatically sorted by natural order (salary)
        // while we are adding them into the Collections objects
        // so we choose SortedSet for this

        // Create a SortedSet of Job with TreeSet implementation
        // add 5 jobs and print them out vertically and see what you get

        SortedSet<Job> jobSet = new TreeSet<>();

        jobSet.add(new Job("CA", 120000, "Apple"));
        jobSet.add(new Job("CA", 100000, "Google"));
        jobSet.add(new Job("VA", 90000, "Bank of America"));
        jobSet.add(new Job("FL", 115000, "Costco"));
        jobSet.add(new Job("NY", 105000, "Wells Fargo"));

        for(Job each : jobSet){
            System.out.println("each = " + each);
        }
        


    }
}
