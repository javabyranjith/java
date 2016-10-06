package jbr.treemap;

import jbr.maputil.MapSortingByValue;
import jbr.maputil.MyTreeMap;

public class TreeMapValueSorting {

  public static void main(String[] args) {
    MapSortingByValue.sortByValueUsingCollectionSort(MyTreeMap.getMapStringInteger(), "ASC");
    MapSortingByValue.sortByValueUsingCollectionSort(MyTreeMap.getMapStringInteger(), "DESC");

    System.out.println("\n");
    MapSortingByValue.sortByValue(MyTreeMap.getMapStringInteger(), "ASC");
    MapSortingByValue.sortByValue(MyTreeMap.getMapStringInteger(), "DESC");
  }

}
