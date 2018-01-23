package jbr.hashmap;

import jbr.maputil.MapSortingByKey;
import jbr.maputil.MyHashMap;

public class HashMapKeySorting {
  public static void main(String[] args) {
    MapSortingByKey.sortMapStringString(MyHashMap.getMap1StringString(), "ASC");
    MapSortingByKey.sortMapStringString(MyHashMap.getMap1StringString(), "DESC");

    System.out.println("\n");
    MapSortingByKey.sortMapIntegerString(MyHashMap.getMapIntegerString(), "ASC");
    MapSortingByKey.sortMapIntegerString(MyHashMap.getMapIntegerString(), "DESC");

    System.out.println("\n");
    MapSortingByKey.sortMapFloatString(MyHashMap.getMap1FloatString(), "ASC");
    MapSortingByKey.sortMapFloatString(MyHashMap.getMap1FloatString(), "DESC");
  }
}
