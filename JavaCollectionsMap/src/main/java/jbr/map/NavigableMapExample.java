package jbr.map;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapExample {

  public static void main(String[] args) {
    NavigableMap<String, String> navigableMap = new TreeMap<String, String>();
    navigableMap.put("4", "Four");
    navigableMap.put("1", "One");
    navigableMap.put("5", "Five");
    navigableMap.put("3", "Three");
    navigableMap.put("2", "Two");

    System.out.println("\nReverse Key");
    System.out.println("-------------");
    Set reverseKey = navigableMap.descendingKeySet();
    Iterator itr = reverseKey.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    System.out.println("\nReverse Map");
    System.out.println("-------------");
    Map<String, String> reverseMap = navigableMap.descendingMap();
    for (Map.Entry<String, String> map : reverseMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nCeiling Key: " + navigableMap.ceilingKey("3"));
    System.out.println("\nFloor Key: " + navigableMap.floorKey("3"));
    System.out.println("\nHigher Key: " + navigableMap.higherKey("3"));
    System.out.println("\nLower Key: " + navigableMap.lowerKey("3"));

    System.out.println(
        "\nFirst Entry: " + navigableMap.firstEntry().getKey() + " >> " + navigableMap.firstEntry().getValue());
    System.out
        .println("\nLast Entry: " + navigableMap.lastEntry().getKey() + " >> " + navigableMap.lastEntry().getValue());
  }
}
