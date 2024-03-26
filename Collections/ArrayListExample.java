package Collections;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

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
