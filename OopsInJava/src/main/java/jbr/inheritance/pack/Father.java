package jbr.inheritance.pack;

public class Father {

  String motherName = "Bakyalakshmi";

  void familyName() {
    System.out.println("Ranjith & Family");
  }

  public String name = "Ranjith";

  public String birthDay() {
    return "Oct 31";
  }

  public int calcAge() throws NumberFormatException {
    return 34;
  }

  private int age = 33;

  private int salary() {
    return 10000;
  }

  protected String lock = "mylock";

  protected int balance() {
    return 30000;
  }

}
