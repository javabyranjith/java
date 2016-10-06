package jbr.treemap;

import java.util.Map;

/**
 * TreeMap - by default sorted by key ascending for any key type(String, Integer, Float etc.,)
 */
public class TreeMapDefaultSorting {

  public static void main(String[] args) {

    System.out.println("MAP<STRING(INTEGER), STRING>");
    for (Map.Entry<String, String> map : MyTreeMap.getMap1StringString().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nMAP<STRING, STRING>");
    for (Map.Entry<String, String> map : MyTreeMap.getMap2StringString().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nMAP<INTEGER, STRING>");
    for (Map.Entry<Integer, String> map : MyTreeMap.getMapIntegerString().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nMAP<STRING, INTEGER>");
    for (Map.Entry<String, Integer> map : MyTreeMap.getMapStringInteger().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nMAP1<FLOAT, INTEGER>");
    for (Map.Entry<Float, String> map : MyTreeMap.getMapFloat1String().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nMAP2<STRING(FLOAT), INTEGER>");
    for (Map.Entry<String, String> map : MyTreeMap.getMapFloat2String().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }
  }

}
