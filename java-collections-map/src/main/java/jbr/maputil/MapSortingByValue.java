package jbr.maputil;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapSortingByValue {
  public static Map<String, Integer> sortByValue(final Map<String, Integer> inputMap, final String sorting) {
    System.out.println("Value=Integer sorting=" + sorting);
    for (Map.Entry<String, Integer> map : inputMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    Comparator<String> c = new Comparator<String>() {

      public int compare(String key1, String key2) {
        int result = sorting.equals("DESC") ? inputMap.get(key2).compareTo(inputMap.get(key1))
            : inputMap.get(key1).compareTo(inputMap.get(key2));

        if (result == 0)
          return 1;
        else return result;
      }
    };

    Map<String, Integer> sortedMap = new TreeMap<String, Integer>(c);
    sortedMap.putAll(inputMap);

    System.out.println("After " + sorting + " sorting...");
    for (Map.Entry<String, Integer> map : sortedMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    return sortedMap;
  }

  public static Map<String, Integer> sortByValueUsingCollectionSort(Map<String, Integer> inputMap,
      final String sorting) {
    System.out.println("Value=Integer sorting=" + sorting);
    for (Map.Entry<String, Integer> map : inputMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }
    Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();

    List<Map.Entry<String, Integer>> mapList = new LinkedList<Map.Entry<String, Integer>>(inputMap.entrySet());
    Collections.sort(mapList, new Comparator<Map.Entry<String, Integer>>() {

      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (sorting.equals("ASC")) {
          return (o1.getValue()).compareTo(o2.getValue());
        }
        if (sorting.equals("DESC")) {
          return (o2.getValue()).compareTo(o1.getValue());
        }
        return 0;
      }
    });

    for (Map.Entry<String, Integer> list : mapList) {
      sortedMap.put(list.getKey(), list.getValue());
    }

    System.out.println("After " + sorting + " sorting...");
    for (Map.Entry<String, Integer> map : sortedMap.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    return sortedMap;
  }
}
