package jbr.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

  static void addSpaceAfterNthNumber() {
    String regex = "^(.{5})(.{3})(.*)$";
    String input = "9600087632";
    Pattern patern = Pattern.compile(regex);
    Matcher m = patern.matcher(input);
    if (m.find()) System.out.println(m.group(1) + " " + m.group(2) + " " + m.group(3));
  }
}
