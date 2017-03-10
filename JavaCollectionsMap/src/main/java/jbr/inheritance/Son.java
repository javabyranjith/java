package jbr.inheritance;

import jbr.inheritance.pack.Father;

public class Son extends Father {

  public static void main(String[] args) {
    Father father = new Father();
    // all PUBLIC members & methods CAN be accessed
    System.out.println("Father Name: " + father.name);
    System.out.println("Father Birth Day: " + father.birthDay());

    // all PRIVATE members & methods CAN'T be accessed
    // System.out.println("Father Age: " + father.age);
    // ERROR: The field Father.age is not visible

    // System.out.println("Father Salary: " + father.salary());
    // ERROR: The method salary() from the type Father is not visible

    // all PROTECTED members & methods CAN'T be accessed outside the package
    // System.out.println("Father Lock: " + father.lock);
    // ERROR : The field Father.lock is not visible

    // System.out.println("Father Balance: " + father.balance());
    // ERROR: The method balance() from the type Father is not visible

    // all DEFAULT members & methods CAN'T be accessed outside the package
    // System.out.println("Mother Name: " + father.motherName);
    // The field Father.motherName is not visible
  }

  public int salary() {
    return salary();
  }

  public String birthday() {
    return super.birthDay();
  }

  public String fatherName() {
    return name;
  }
}
