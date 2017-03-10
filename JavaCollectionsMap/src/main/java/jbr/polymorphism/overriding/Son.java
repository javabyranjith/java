package jbr.polymorphism.overriding;

public class Son extends Father {

  public void getName() {
    System.out.println("Son Name is: Kabilan");
  }

  public void xyz() {
    System.out.println("xyz() method of Child class");
  }

  public static void main(String args[]) {
    // Parent class reference to child class object
    Father son1 = new Son();
    son1.getName();
    son1.getDob();

    Son son2 = new Son();
    son2.getName();
  }

}
