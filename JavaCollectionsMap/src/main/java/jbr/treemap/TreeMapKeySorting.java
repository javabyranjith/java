package jbr.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapKeySorting {
  public static void main(String[] args) {
    System.out.println("Key=STRING");
    // default key sort is ascending, now sort key by descending using comparator
    Map<String, String> dscTreeMap = new TreeMap<String, String>(new Comparator<String>() {
      public int compare(String key1, String key2) {
        return key2.compareTo(key1);
      }
    });
    dscTreeMap.putAll(MyTreeMap.getMap2StringString());
    System.out.println("After ASC Sort.....");
    for (Map.Entry<String, String> map : dscTreeMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nKey=INTEGER");
    // default key sort is ascending, now sort key by descending using comparator
    Map<Integer, String> dscTreeMap1 = new TreeMap<Integer, String>(new Comparator<Integer>() {
      public int compare(Integer key1, Integer key2) {
        return key2.compareTo(key1);
      }
    });
    dscTreeMap1.putAll(MyTreeMap.getMapIntegerString());
    System.out.println("After ASC Sort.....");
    for (Map.Entry<Integer, String> map : dscTreeMap1.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nKey=FLOAT");
    // default key sort is ascending, now sort key by descending using comparator
    Map<Float, String> dscTreeMap2 = new TreeMap<Float, String>(new Comparator<Float>() {
      public int compare(Float key1, Float key2) {
        return key2.compareTo(key1);
      }
    });
    dscTreeMap2.putAll(MyTreeMap.getMapFloat1String());
    System.out.println("After ASC Sort.....");
    for (Map.Entry<Float, String> map : dscTreeMap2.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }
  }
}
