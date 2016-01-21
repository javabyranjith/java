package jbr.javabasics.superkeyword;

/**
 * @author Ranjith Sekar
 * @since May 21, 2014
 * 
 */
public class Parent {

  private int age;
  private String address = "chennai";

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  Parent() {
    System.out.println("I am Parent()");
  }

  Parent(int ageVal) {
    age = ageVal;
    System.out.println("I am Parent(int age): " + age);
  }

}
