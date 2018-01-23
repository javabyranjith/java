package jbr.treemap;

import jbr.maputil.MapSortingByKey;
import jbr.maputil.MyTreeMap;

public class TreeMapKeySorting {
  public static void main(String[] args) {
    MapSortingByKey.sortMapStringString(MyTreeMap.getMap1StringString(), "ASC");
    MapSortingByKey.sortMapStringString(MyTreeMap.getMap1StringString(), "DESC");

    System.out.println("\n");
    MapSortingByKey.sortMapIntegerString(MyTreeMap.getMapIntegerString(), "ASC");
    MapSortingByKey.sortMapIntegerString(MyTreeMap.getMapIntegerString(), "DESC");

    System.out.println("\n");
    MapSortingByKey.sortMapFloatString(MyTreeMap.getMapFloat1String(), "ASC");
    MapSortingByKey.sortMapFloatString(MyTreeMap.getMapFloat1String(), "DESC");
  }
}
