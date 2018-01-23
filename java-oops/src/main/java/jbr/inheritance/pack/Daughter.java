package jbr.inheritance.pack;

public class Daughter extends Father {
  public static void main(String[] args) {
    Father father = new Father();
    // all DEFAULT members & methods CAN be accessed within the package
    System.out.println("Mother Name: " + father.motherName);
    father.familyName();

    // all PUBLIC members & methods CAN be accessed
    System.out.println("Father Name: " + father.name);
    System.out.println("Father Birth Day: " + father.birthDay());

    // all PRIVATE members & methods CAN'T be accessed
    // System.out.println("Father Age: " + father.age);
    // ERROR: The field Father.age is not visible

    // System.out.println("Father Salary: " + father.salary());
    // ERROR: The method salary() from the type Father is not visible

    // all PROTECTED members & methods CAN be accessed within the package
    System.out.println("Father Lock: " + father.lock);
    System.out.println("Father Balance: " + father.balance());

    Daughter daughter = new Daughter();
    System.out.println(daughter.calcAge());
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

  public void familyName() {
    familyName();
  }

  // CASE 1 & CASE 2 will be PASS if we use composition
  /**
   * CASE 1: change the Exception type of inherited method. Exception Exception is not compatible with throws clause in
   * Father.calcAge()
   * 
   * @Override public int calcAge() throws Exception { return 33; }
   */

  /**
   * CASE 2: change return type of inherited method. The return type is incompatible with Father.calcAge()
   * 
   * @Override public String calcAge() throws NumberFormatException { return super.calcAge(); }
   */

}
