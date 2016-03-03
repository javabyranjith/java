package jbr.javacore.string;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
  String[] array1 = new String[] { "Ranjith", "Sekar", "Test", "User" };
  String[] array2 = new String[] { "Test", "User" };
  String[] array3 = new String[] { "Test", "User", "Monday" };
  String[] array4 = new String[] { "Ranjith", "Sekar", "Test", "User", "Sekar" };

  @Test
  public void testConcatDelimiter() {
    String result = StringUtils.concatDelimiter(array1, "|");
    System.out.println("testConcatDelimiter: " + result);

    Assert.assertEquals("Ranjith|Sekar|Test|User", result);
  }

  @Test
  public void testRemove() {
    String[] result = StringUtils.remove(array1, array2);
    String output = StringUtils.concatDelimiter(result, "|");
    System.out.println("testRemove: " + output);

    Assert.assertEquals("Ranjith|Sekar", output);
  }

  @Test
  public void testFindIntersect() {
    String[] result = StringUtils.findIntersect(array1, array3);
    String output = StringUtils.concatDelimiter(result, "|");
    System.out.println("testFindIntersect: " + output);
    Assert.assertEquals("Test|User", output);
  }

  @Test
  public void testFindValueInArray() {
    Assert.assertEquals(-1, StringUtils.findValueInArray(array1, "Monday"));
    Assert.assertEquals(0, StringUtils.findValueInArray(array1, "Ranjith"));
  }

  @Test
  public void testFindUnion() {
    String[] result = StringUtils.findUnion(array1, array3);
    String output = StringUtils.concatDelimiter(result, "|");
    System.out.println("testFindUnion: " + output);

    Assert.assertEquals("Ranjith|Sekar|Test|User|Monday", output);
  }

  @Test
  public void testRemovingDuplicatesInArray() {
    String[] result = StringUtils.removingDuplicatesInArray(array4);
    String output = StringUtils.concatDelimiter(result, "|");
    System.out.println("testRemovingDuplicatesInArray: " + output);

    Assert.assertEquals("Ranjith|Sekar|Test|User", output);

  }

  @Test
  public void testConvertStringArrayIntoIntArray() {
    int[] result = StringUtils.convertStringArrayIntoIntArray(new String[] { "2", "3", "1" });
    System.out.println("testConvertStringArrayIntoIntArray: " + result[2]);
    Assert.assertTrue(result[0] == 2);
    Assert.assertTrue(result[1] == 3);
    Assert.assertTrue(result[2] == 1);
  }

  @Test
  public void testConvertIntArrayToStringArray() {
    String[] result = StringUtils.convertIntArrayToStringArray(new Integer[] { 2, 3, 1 });
    System.out.println("testConvertIntArrayToStringArray: " + result);
    Assert.assertTrue(result[0].equals("2"));
    Assert.assertTrue(result[1].equals("3"));
    Assert.assertTrue(result[2].equals("1"));
  }

}
