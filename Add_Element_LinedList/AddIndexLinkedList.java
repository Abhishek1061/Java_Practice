package Add_Element_LinedList;

import java.util.LinkedList;

public class AddIndexLinkedList {
    public static void main(String[] args){

        // create a linkedlist
        LinkedList<String> languages = new LinkedList<>();

        // add elements to LinkedList
        languages.add("Swift");
        languages.add("Python");
        System.out.println("LinkedList: " + languages);

        // add element at the specified position
        languages.add(0, "Java");
        System.out.println("Updated LinkedList: " + languages);
    }
}
