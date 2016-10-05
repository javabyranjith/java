package jbr.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class SortHashMap {

  public static void main(String[] args) {

    // By default sorted by key
    Map<Integer, String> map1 = new HashMap<Integer, String>();
    map1.put(1, "AAA");
    map1.put(3, "CCC");
    map1.put(5, "EEE");
    map1.put(4, "DDD");
    map1.put(2, "BBB");
    for (Map.Entry<Integer, String> m : map1.entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());
    }

    Map<String, Integer> map2 = new HashMap<String, Integer>();
    map2.put("DDD", 4);
    map2.put("EEE", 5);
    map2.put("BBB", 2);
    map2.put("CCC", 3);
    map2.put("AAA", 1);

    for (Map.Entry<String, Integer> m : map2.entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());
    }
  }
}
