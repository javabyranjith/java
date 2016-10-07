package jbr.map;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

  public static void main(String[] args) {
    System.out.println("Treemap sorted by key's ascending order:");
    System.out.println("---------------------------------------");
    SortedMap<String, String> sortedMap1 = new TreeMap<String, String>();
    sortedMap1.put("firstname", "Ranjith");
    sortedMap1.put("lastname", "Sekar");
    sortedMap1.put("city", "Chennai");
    sortedMap1.put("country", "India");
    for (Map.Entry<String, String> m : sortedMap1.entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());
    }

    System.out.println("\nSort Treemap by key's descending order:");
    System.out.println("---------------------------------------");
    SortedMap<String, String> sortedMap2 = new TreeMap<String, String>(new Comparator<String>() {
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    });
    sortedMap2.put("firstname", "Ranjith");
    sortedMap2.put("lastname", "Sekar");
    sortedMap2.put("city", "Chennai");
    sortedMap2.put("country", "India");
    for (Map.Entry<String, String> m : sortedMap2.entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());
    }
    System.out.println("\nfirstKey: " + sortedMap2.firstKey());
    System.out.println("\nlastKey: " + sortedMap2.lastKey());

    System.out.println("\nHead Map from key: country");
    // headmap returns top elements from the key given.
    for (Map.Entry<String, String> m : sortedMap2.headMap("country").entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());
    }
    // tailmap
    System.out.println("\nTail Map from key: country");
    for (Map.Entry<String, String> m : sortedMap2.tailMap("country").entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());
    }

    // submap
    System.out.println("\nTail Map key from 'lastname' to country'");
    for (Map.Entry<String, String> m : sortedMap2.subMap("lastname", "country").entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());
    }

  }
}
