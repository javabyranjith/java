package jbr.java11.order.phone;

import jbr.java11.payment.Payment;

public class OrderPhone {

  public void orderPhone() {
    System.out.println("Order Phone");
    new Payment().pay();
  }
}
