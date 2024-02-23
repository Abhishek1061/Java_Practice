package Access_Elements_LinkedList;

import java.util.LinkedList;

public class AccessElementsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lang = new LinkedList<>();

        lang.add("Python");
        lang.add("Java");
        lang.add("JavaScript");
        System.out.println("LinkedList: " + lang);


        String str = lang.get(2);
        System.out.print("Element at index 2: " + str);
    }
}
