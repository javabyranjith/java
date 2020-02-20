package jbr.java.utilpack;

import java.util.ArrayList;
import java.util.List;

//http://stackoverflow.com/questions/34940703/how-to-iterate-arraylist-of-arraylists
public class IterateListOfList {
  public static void main(String[] args) {
    List<List<String>> myList = new ArrayList<List<String>>();

    List<String> list1 = new ArrayList<String>();
    list1.add("SAM");
    list1.add("12/01/2015");
    list1.add("9A-6P");

    List<String> list2 = new ArrayList<String>();
    list2.add("JAM");
    list2.add("12/01/2015");
    list2.add("9A-6P");

    myList.add(list1);
    myList.add(list2);

    for (List list : myList) {
      for(int i=0; i<list.size();i++){
        System.out.println(list.get(i));
      }

    }
  }
}
