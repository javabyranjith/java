package jbr.hashmap;

import jbr.maputil.MapSortingByValue;
import jbr.maputil.MyLinkedHashMap;

/**
 * LinkedHashMap - 1) Maintains the order of insertion
 */
public class LinkedHashMapValueSorting {

  public static void main(String[] args) {

    MapSortingByValue.sortByValue(MyLinkedHashMap.getMapStringInteger(), "ASC");
    MapSortingByValue.sortByValue(MyLinkedHashMap.getMapStringInteger(), "DESC");
  }
}
