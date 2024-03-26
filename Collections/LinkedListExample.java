package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Abhishek");
        list.add("Suraj");
        list.add("Hima");

//        System.out.println(list);
        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
