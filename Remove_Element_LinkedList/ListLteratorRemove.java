package Remove_Element_LinkedList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListLteratorRemove {
    public static void main(String[] args) {
        ArrayList<String> animals= new ArrayList<>();

        // add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedList: " + animals);

        // creating an object of ListIterator
        ListIterator<String> listIterate = animals.listIterator();
        listIterate.next();

        // Remove element returned by next()
        listIterate.remove();
        System.out.println("New LinkedList: " + animals);
    }
}
