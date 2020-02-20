package jbr.object.cloing;

/**
 * 
 * In deep cloning, even the cloned object value changed, the actual object
 * value will not be changed.
 */
public class DeepCloning {

  public static void main(String[] args) throws Exception {

    System.out.println("Actual object");
    Employee emp1 = new Employee(100, "Ranjith", "Engineeer", new Education("B.Tech", 75, 2010));
    System.out.println(emp1.getName());
    System.out.println(emp1.getEducation().getPercentage());

    System.out.println("\nCloned Object");
    Employee emp2 = (Employee) emp1.clone();
    System.out.println(emp2.getName());
    System.out.println(emp2.getEducation().getPercentage());

    System.out.println("\nChange value in Cloned object");
    emp2.getEducation().setPercentage(85);
    System.out.println("emp1: " + emp1.getEducation().getPercentage());
    System.out.println("emp2: " + emp2.getEducation().getPercentage());

  }
}
