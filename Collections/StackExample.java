package Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        The stack is the subclass of Vector.
        Stack<String> stack = new Stack<String>();

        stack.push("Abhi");
        stack.push("Suraj");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");

        stack.pop();

//        The stack.peek() method in Java is used to look at the object at the top of this stack without removing it from the stack.
        System.out.println(stack.peek());

        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
