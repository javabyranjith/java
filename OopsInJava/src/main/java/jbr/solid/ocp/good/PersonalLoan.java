package jbr.solid.ocp.good;

public class PersonalLoan implements Loan {

  @Override
  public void process() {
    System.out.println("Personal Loan Process");
  }

}
