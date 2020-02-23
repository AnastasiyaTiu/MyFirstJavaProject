package Day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OfficeHour_method {
    public static void main(String[] args) {

        /*
        Remove method
        remove(int index): removes the given index number

        remove(Object): removes the first matching object of the arrayList, returns boolean value

         */

        // give name list: Ahmet, John, Ahmet, Eric, Aaron

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet", "Eric", "Ahmet", "John", "Aaron", "Ahmet") );

        System.out.println(employees);
         employees.removeAll(Arrays.asList("Ahmet") );
        System.out.println(employees);

        List<String> employees2 = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet", "Eric", "Ahmet", "John", "Aaron", "Ahmet") );

        employees.retainAll(Arrays.asList("Ahmet") );
        System.out.println(employees2);


    }
}
