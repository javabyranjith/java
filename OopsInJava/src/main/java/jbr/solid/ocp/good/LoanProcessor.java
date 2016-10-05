package jbr.solid.ocp.good;

public class LoanProcessor {

  public void validateLoanApplication(Loan loan) {
    loan.process();
  }

  public static void main(String[] args) {
    LoanProcessor lp = new LoanProcessor();
    lp.validateLoanApplication(new PersonalLoan());
    lp.validateLoanApplication(new JewellaryLoan());
  }
}
