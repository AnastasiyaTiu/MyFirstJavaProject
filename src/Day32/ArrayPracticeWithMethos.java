package Day32;

import javax.xml.stream.XMLInputFactory;

public class ArrayPracticeWithMethos {
    public static void main(String[] args) {

    compare2arraySize(new String[]{"Sezgin", "Senay", "Astrit"}, new String[]{"Araz"});

    String[] names1 = {"Superman", "Batman", "Flash"};
    String[] names2 = {"Wonder Woman", "Cyborg", "Aquaman"};
    compare2arraySize(names1, names2);
}
/*
 * compare2arraySize
 * create a method that accept 2 String array object
 * and compare the item counts inside these 2 arrays
 * if arr1 is more then print array 1 has more item
 * if arr2 is more then print array 2 has more item
 * else print they have same item count
 */
public static void compare2arraySize(String[] arr1, String[] arr2) {
        if (arr1.length > arr2.length) {
        System.out.println("array 1 has more item ");
        } else if (arr1.length < arr2.length) {
        System.out.println("array 2 has more item ");
        } else {
        System.out.println("they have same item count");
        }
}
        }