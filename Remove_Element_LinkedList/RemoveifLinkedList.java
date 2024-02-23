package Remove_Element_LinkedList;

import java.util.LinkedList;

public class RemoveifLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // add elements in LinkedList
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("LinkedList: " + numbers);

        // remove all elements less than 4
        numbers.removeIf((Integer i) -> i < 4);
        System.out.println("Updated LinkedList: " + numbers);

    }
}
