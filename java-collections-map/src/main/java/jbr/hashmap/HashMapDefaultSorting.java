package jbr.hashmap;

import java.util.Map;

import jbr.maputil.MyHashMap;

/**
 * TreeMap - by default sorted by key ascending for any key type(String, Integer, Float etc.,)
 */
public class HashMapDefaultSorting {

  public static void main(String[] args) {

    System.out.println("MAP<STRING(INTEGER), STRING>");
    for (Map.Entry<String, String> map : MyHashMap.getMap1StringString().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nMAP<STRING, STRING>");
    for (Map.Entry<String, String> map : MyHashMap.getMap2StringString().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nMAP<INTEGER, STRING>");
    for (Map.Entry<Integer, String> map : MyHashMap.getMapIntegerString().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nMAP<STRING, INTEGER>");
    for (Map.Entry<String, Integer> map : MyHashMap.getMapStringInteger().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nMAP1<FLOAT, INTEGER>");
    for (Map.Entry<Float, String> map : MyHashMap.getMap1FloatString().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

    System.out.println("\nMAP2<STRING(FLOAT), INTEGER>");
    for (Map.Entry<String, String> map : MyHashMap.getMap2FloatString().entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }
  }

}
