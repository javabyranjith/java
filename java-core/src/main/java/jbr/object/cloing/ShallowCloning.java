package jbr.object.cloing;

/**
 * In Shallow cloning, the cloned object and actual object is tightly coupled.
 * When we change value in anyone object, it will also affect the other.
 * 
 */
public class ShallowCloning {

  public static void main(String[] args) throws Exception {
    Person p1 = new Person("Ranjith", "Sekar", new Address(22, "Gandhi Street", "Chennai", 600089));
    System.out.println("===Actual Object Value ");
    System.out.println("First Name: " + p1.getFirstname());
    System.out.println("Last Name: " + p1.getLastname());
    System.out.println("City: " + p1.getAddress().getCity());

    Person p2 = (Person) p1.clone();

    // check the cloned object values
    System.out.println("\n===Cloned Object Value ");
    System.out.println("First Name: " + p2.getFirstname());
    System.out.println("Last Name: " + p2.getLastname());
    System.out.println("City: " + p2.getAddress().getCity());

    // Change any value of cloned object
    System.out.println("\n===After Changing values of cloned object");
    p2.setFirstname("Kabilan");
    p2.setLastname("Ranjith");
    p2.getAddress().setCity("Bangalore");
    System.out.println("First Name: " + p2.getFirstname());
    System.out.println("Last Name: " + p2.getLastname());
    System.out.println(p2.getAddress().getCity());

    // change any value of actual object
    System.out.println("\n After changing actual object");
    p1.setFirstname("Karthik");
    p1.setLastname("Ram");
    p2.getAddress().setCity("Kochin");
    System.out.println("First Name: " + p1.getFirstname());
    System.out.println("Last Name: " + p1.getLastname());
    System.out.println(p1.getAddress().getCity());

    System.out.println("First Name: " + p2.getFirstname());
    System.out.println("Last Name: " + p2.getLastname());
    System.out.println(p2.getAddress().getCity());
  }
}
