package jbr.solid.ocp.good;

public class JewellaryLoan implements Loan {

  @Override
  public void process() {
    System.out.println("Jewllary Loan Process");
  }

}
