package jbr.java8.lamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {

  public static void main(String[] args) {

    List<String> uppercases = new ArrayList<String>();
    uppercases.add("C");
    uppercases.add("B");
    uppercases.add("E");
    uppercases.add("D");
    uppercases.add("A");

    List<String> lowercases = new ArrayList<String>();
    lowercases.add("c");
    lowercases.add("b");
    lowercases.add("e");
    lowercases.add("d");
    lowercases.add("a");

    List numbers = new ArrayList();
    numbers.add(4);
    numbers.add(2);
    numbers.add(3);
    numbers.add(5);
    numbers.add(1);

    // java 7 sorting
    System.out.println("==JAVA 7");
    System.out.println("Before Sorting: " + uppercases);
    Collections.sort(uppercases, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.compareTo(s2);
      }
    });
    System.out.println("After Sorting: " + uppercases);

    // java 8 - using lamda
    System.out.println("\n==JAVA 8");
    System.out.println("Before Sorting: " + lowercases);
    Collections.sort(lowercases, (s1, s2) -> s1.compareTo(s2));
    System.out.println("After Sorting: " + lowercases);

    System.out.println("\nBefore Sorting: " + numbers);
    Collections.sort(numbers, (s1, s2) -> String.valueOf(s1).compareTo(String.valueOf(s2)));
    System.out.println("After Sorting: " + numbers);
  }

}
