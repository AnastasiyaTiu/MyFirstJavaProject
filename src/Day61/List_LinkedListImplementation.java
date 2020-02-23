package Day61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {

        // ArrayList is backed by array in the back
        // so if we have ArrayList with 4 element
        // in the back we have array with size 4 holding all those elements

        // if you add one item to the list using add method
        // it will create an array with size 5 with copy of all foe above
        // and add the new item at the end

      // List<String> lst = new ArrayList<>();

        // linked list is backed by something called Node
        // see it as 4 people holding hands
        // the neighboring person have pointer to previous and next person

        // if you want to add one person ,
        // new person will just have to hold last person's hand
        // if you want to insert in the middle
        // new person just need to hold previous and next person's hand

        List<String> lst = new LinkedList<>();
        lst.add("Zeynap");
        lst.add("Ershat");
        lst.add("Karima");
        lst.add("Sabira");

        System.out.println("lst = " + lst);

        lst.remove("Ershat");
        System.out.println("lst = " + lst);
}
}
