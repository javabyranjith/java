package jbr.javabasics.superkeyword;

/**
 * @author Ranjith Sekar
 * @since May 21, 2014
 * 
 */
public class Child extends Parent {

  Child() {
    super();
    System.out.println("I am Child()");
  }

  Child(int age) {
    super(age);
    System.out.println("I am Child(int age)");
  }

  public static void main(String[] args) {
    System.out.println("Super Keyword Example");
    new Child();

    Child argConst = new Child(15);
    System.out.println("Age: " + argConst.getAge());
  }
}
