package jbr.maputil;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MapSortingByKey {

  public static Map<String, String> sortMapStringString(Map<String, String> inputMap, final String sorting) {
    System.out.println("Key=STRING, Sorting=" + sorting);
    for (Map.Entry<String, String> map : inputMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }
    // default key sort is ascending, now sort key by descending using comparator
    Map<String, String> sortedMap = new TreeMap<String, String>(new Comparator<String>() {
      public int compare(String key1, String key2) {
        return sorting.equals("DESC") ? key2.compareTo(key1) : key1.compareTo(key2);
      }
    });
    sortedMap.putAll(inputMap);

    System.out.println("After " + sorting + " Sort.....");
    for (Map.Entry<String, String> map : sortedMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    return sortedMap;
  }

  public static Map<Integer, String> sortMapIntegerString(Map<Integer, String> inputMap, final String sorting) {
    System.out.println("\nKey=INTEGER Sorting=" + sorting);
    for (Map.Entry<Integer, String> map : inputMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }
    // default key sort is ascending, now sort key by descending using comparator
    Map<Integer, String> sortedMap = new TreeMap<Integer, String>(new Comparator<Integer>() {
      public int compare(Integer key1, Integer key2) {
        return sorting.equals("DESC") ? key2.compareTo(key1) : key1.compareTo(key2);
      }
    });
    sortedMap.putAll(inputMap);

    System.out.println("After " + sorting + " Sort.....");
    for (Map.Entry<Integer, String> map : sortedMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }
    return sortedMap;
  }

  public static Map<Float, String> sortMapFloatString(Map<Float, String> inputMap, final String sorting) {
    System.out.println("\nKey=FLOAT Sorting=" + sorting);
    for (Map.Entry<Float, String> map : inputMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }
    // default key sort is ascending, now sort key by descending using comparator
    Map<Float, String> sortedMap = new TreeMap<Float, String>(new Comparator<Float>() {
      public int compare(Float key1, Float key2) {
        return sorting.equals("DESC") ? key2.compareTo(key1) : key1.compareTo(key2);
      }
    });
    sortedMap.putAll(inputMap);

    System.out.println("After " + sorting + " Sort.....");
    for (Map.Entry<Float, String> map : sortedMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    return sortedMap;
  }
}
