package Day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OfficeHour_ConvertingArrayToList {
    public static void main(String[] args) {

        /*
        addAll(CollectionType): removes all the matching objects from list

        removeAll(CollectionType): removes all the matching objects from list

        retainAll(CollectionType): removes all the NOT matching objects from list

      * Arrays.asList(data collection): returns the data
           collections as List interface(Collection framework)
      *


         */
       Integer[] nums = {1,2,3,4,5,6,7,8};
       List<Integer> list5 = Arrays.asList(nums);
        System.out.println("list5 = " + list5);

        String[] students = {"Nursultan", "Irina", "Dilshat", "Roksana"};
        List<String> names = new ArrayList<>(Arrays.asList(students));
          //  names.addAll(Arrays.asList(students) );
        names.addAll(Arrays.asList("Mohammad", "Bulet") );

        System.out.println("names = " + names);

        List<String> grades = new ArrayList<>();
        grades.addAll(Arrays.asList("A","B", "A", "C","D", "E", "F" ) );

        grades.removeAll(Arrays.asList("A", "C") );
        System.out.println(grades);  // [B, D, E, F]

        List<String> cars = new ArrayList<>();
           cars.addAll(Arrays.asList("BMW", "Corolla", "BMW", "Jaguar", "Honda", "Tesla") );
        // -remove all cars that are not BMW, or Jaguar, or Tesla
           cars.retainAll(Arrays.asList("BMW", "Jaguar", "Tesla") );
        System.out.println(cars);
    }
}
