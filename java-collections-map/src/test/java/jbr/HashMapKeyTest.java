package jbr;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;

import jbr.maputil.MapSortingByKey;
import jbr.maputil.MyHashMap;
import junit.framework.Assert;

public class HashMapKeyTest {

  @Test
  public void testStringKeyAsc() {
    Map<String, String> ascMap = MapSortingByKey.sortMapStringString(MyHashMap.getMap1StringString(), "ASC");
    Assert.assertEquals("Two", (new ArrayList<String>(ascMap.values())).get(1));
  }

  @Test
  public void testStringKeyDesc() {
    Map<String, String> descMap = MapSortingByKey.sortMapStringString(MyHashMap.getMap1StringString(), "DESC");
    Assert.assertEquals("Four", (new ArrayList<String>(descMap.values())).get(1));
  }

  @Test
  public void testIntegerKeyAsc() {
    Map<Integer, String> ascMap = MapSortingByKey.sortMapIntegerString(MyHashMap.getMapIntegerString(), "ASC");
    Assert.assertEquals("Two", (new ArrayList<String>(ascMap.values())).get(1));
  }

  @Test
  public void testIntegerKeyDesc() {
    Map<Integer, String> descMap = MapSortingByKey.sortMapIntegerString(MyHashMap.getMapIntegerString(), "DESC");
    Assert.assertEquals("Four", (new ArrayList<String>(descMap.values())).get(1));
  }

  @Test
  public void testFloatKeyAsc() {
    Map<Float, String> ascMap = MapSortingByKey.sortMapFloatString(MyHashMap.getMap1FloatString(), "ASC");
    Assert.assertEquals("one", (new ArrayList<String>(ascMap.values())).get(1));
  }

  @Test
  public void testFloatKeyDesc() {
    Map<Float, String> descMap = MapSortingByKey.sortMapFloatString(MyHashMap.getMap1FloatString(), "DESC");
    Assert.assertEquals("four", (new ArrayList<String>(descMap.values())).get(1));
  }

}
