package jbr.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {

  /**
   * 
   * @param values
   * @param delimiter
   * @return
   */
  public static String concatDelimiter(String[] values, String delimiter) {
    if (values == null) return null;
    if (values.length == 0) return "";

    String value;

    if (values.length == 1) {
      value = values[0];
      return (value == null) ? "" : ((value.length() == 0) ? " " : value);
    }

    StringBuilder stringBuilder = new StringBuilder(values.length * 16);

    for (int i = 0; i < (values.length - 1); i++) {
      value = values[i];

      if (value != null) stringBuilder.append((value.length() == 0) ? " " : value);

      stringBuilder.append(delimiter);
    }

    value = values[values.length - 1];

    if (value != null) stringBuilder.append((value.length() == 0) ? " " : value);

    return stringBuilder.toString();
  }

  /**
   * 
   * @param array1
   * @param array2
   * @return
   */
  public static String[] remove(String[] array1, String[] array2) {
    List<String> output = new ArrayList<String>();

    for (String s : array1) {
      if (findValueInArray(array2, s) == -1) {
        output.add(s);
      }
    }

    return (String[]) output.toArray(new String[output.size()]);
  }

  /**
   * 
   * @param array1
   * @param array2
   * @return
   */
  public static String[] findIntersect(String[] array1, String[] array2) {
    List<String> retVal = new ArrayList<String>();

    for (String s : array2) {
      if (findValueInArray(array1, s) != -1) {
        retVal.add(s);
      }
    }

    return (String[]) retVal.toArray(new String[retVal.size()]);
  }

  /**
   * 
   * @param values
   * @param valueToFind
   * @return
   */
  public static int findValueInArray(String[] values, String valueToFind) {
    if (values != null) {
      for (int i = 0; i < values.length; i++) {
        if (valueToFind.equalsIgnoreCase(values[i])) return i;
      }
    }

    return -1;
  }

  /**
   * 
   * @param array1
   * @param array2
   * @return
   */
  public static String[] findUnion(String[] array1, String[] array2) {
    List<String> retVal = new ArrayList<String>(array1.length + array2.length);
    retVal.addAll(Arrays.asList(array1));

    for (String arr : array2) {
      if ((arr != null) && !retVal.contains(arr) && !retVal.contains(arr.toUpperCase())
          && !retVal.contains(arr.toLowerCase())) {
        retVal.add(arr);
      }
    }

    return (String[]) retVal.toArray(new String[retVal.size()]);
  }

  /**
   * 
   * @param names
   * @return
   */
  public static String[] removingDuplicatesInArray(String[] names) {
    List<String> unique = new ArrayList<String>();

    for (int i = 0; i < names.length; i++) {
      if (!unique.contains(names[i])) {
        unique.add(names[i]);
      }
    }

    return (String[]) unique.toArray(new String[unique.size()]);
  }

  /**
   * 
   * @param values
   * @return
   */
  public static int[] convertStringArrayIntoIntArray(String[] values) {
    if (values == null || values.length < 0) return null;

    int[] intArray = new int[values.length];

    for (int i = 0; i < values.length; i++) {
      intArray[i] = Integer.parseInt(values[i]);
    }

    return intArray;
  }

  /**
   * 
   * @param values
   * @return
   */
  public static String[] convertIntArrayToStringArray(Integer[] values) {
    if ((values == null) || values.length < 0) return null;

    String[] intArray = new String[values.length];

    for (int i = 0; i < values.length; i++) {
      intArray[i] = String.valueOf(values[i]);
    }

    return intArray;
  }
}
