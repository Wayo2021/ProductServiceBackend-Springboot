package com.learning.productservices.java.Advance.JavaCollection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        evenNumber.add(1);
        evenNumber.add(2);
        evenNumber.add(3);
        evenNumber.add(5);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(4);
        System.out.println("New HashMap: " + numbers);

        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("Iterator: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.println();
        boolean value1 = numbers.remove(2);
        System.out.println("Is 2 removed? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);

//        Union
        HashSet<Integer> evenNumber1 = new HashSet<>();
        evenNumber1.add(1);
        evenNumber1.add(2);
        System.out.println("HashSet1: " + evenNumber1);

        HashSet<Integer> numbers1 = new HashSet<>();
        numbers1.add(3);
        numbers1.add(4);
        System.out.println("HashSet2: " + numbers1);

        numbers1.addAll(evenNumber1);
        System.out.println("Union is: " + numbers1);

//        Intersection
        HashSet<Integer> evenNumber2 = new HashSet<>();
        evenNumber2.add(1);
        evenNumber2.add(2);
        System.out.println("HashSet1: " + evenNumber2);

        HashSet<Integer> numbers2 = new HashSet<>();
        numbers2.add(1);
        numbers2.add(3);
        System.out.println("HashSet2: " + numbers2);

        numbers2.retainAll(evenNumber2);
        System.out.println("Intersection is: " + numbers2);

//        Difference
        HashSet<Integer> evenNumber3 = new HashSet<>();
        evenNumber3.add(2);
        evenNumber3.add(3);
        evenNumber3.add(5);
        evenNumber3.add(6);
        System.out.println("HashSet1: " + evenNumber3);

        HashSet<Integer> numbers3 = new HashSet<>();
        numbers3.add(1);
        numbers3.add(3);
        numbers3.add(5);
        System.out.println("HashSet2: " + numbers3);

        evenNumber3.removeAll(numbers3);
        System.out.println("Difference is: " + evenNumber3);

//        Subset
        HashSet<Integer> evenNumber4 = new HashSet<>();
        evenNumber4.add(1);
        evenNumber4.add(2);
        evenNumber4.add(3);
        evenNumber4.add(4);
        System.out.println("HashSet1: " + evenNumber4);

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet2: " + primeNumbers);

        boolean b = evenNumber4.containsAll(primeNumbers);
        System.out.println("Is HashSet2 is a subset of HashSet1?: " + b);
    }
}
