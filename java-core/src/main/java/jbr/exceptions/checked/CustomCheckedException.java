package jbr.exceptions.checked;

public class CustomCheckedException {

  private class EmailException extends Exception {
    private static final long serialVersionUID = 1L;

    EmailException(String errorMessage) {
      super(errorMessage);
    }
  }

  public static void main(String[] args) {

    CustomCheckedException checkedException = new CustomCheckedException();
    String emailAddress = "testtest.com";
    try {
      checkedException.validateEmail(emailAddress);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void validateEmail(String emailAddress) throws EmailException {

    if (!emailAddress.contains("@")) {
      // other logics if required
      throw new EmailException("VALID Email address");
    } else {
      System.out.println("INVALID Email address");
    }
  }
}
