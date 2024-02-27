package HashSet;

import java.util.HashSet; //imported HashSet from the java.util package
import java.util.Set; //imported Set from the java.util package

public class DiffOfTwoSets {
    public static void main(String[] args) {

        // create first set
        //Declaring and initializing a HAshSet  called number to store integer values.
        Set<Integer> numbers = new HashSet<>();
        //using add method adding integer values to the set.
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //Printing the content of numbers set
        System.out.println("Numbers: " + numbers);

        // create second set
        //Declaring and initializing a HashSet  called primeNumber to store prime integer values.
        Set<Integer> primeNumbers = new HashSet<>();
        //adding the prime integer values to set using add method form hashset package.
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("Prime Numbers: " + primeNumbers); //printing the primenumber set values.

        // Difference between HashSet1 and HashSet2
        numbers.removeAll(primeNumbers); //this will remove all the from the "number" set which are also present in "primeNumber " set.
        System.out.println("Numbers without prime numbers: " + numbers); // this will give final list where there are no prime numbers in "number" set.
        }
}
