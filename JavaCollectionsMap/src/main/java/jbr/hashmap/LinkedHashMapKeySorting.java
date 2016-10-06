package jbr.hashmap;

import jbr.maputil.MapSortingByKey;
import jbr.maputil.MyLinkedHashMap;

/**
 * LinkedHashMap - 1) Maintains the order of insertion
 */
public class LinkedHashMapKeySorting {

  public static void main(String[] args) {

    MapSortingByKey.sortMapIntegerString(MyLinkedHashMap.getMapIntegerString(), "ASC");
    MapSortingByKey.sortMapIntegerString(MyLinkedHashMap.getMapIntegerString(), "DESC");

  }
}
