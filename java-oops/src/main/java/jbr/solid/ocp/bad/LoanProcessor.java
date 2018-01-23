package jbr.solid.ocp.bad;

public class LoanProcessor {

  public void validateLoanApplication(Object loan) {

    if (loan instanceof PersonalLoan) {
      ((PersonalLoan) loan).process();

    } else if (loan instanceof JewellaryLoan) {
      ((JewellaryLoan) loan).process();
    }

    // new loan implementations
  }

  public static void main(String[] args) {

    LoanProcessor lp = new LoanProcessor();
    lp.validateLoanApplication(new PersonalLoan());
  }
}
