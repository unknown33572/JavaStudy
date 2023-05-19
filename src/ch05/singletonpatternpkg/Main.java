package ch05.singletonpatternpkg;

import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    Company c1=Company.getInstance();
    Company c2=Company.getInstance();
    System.out.println(c1);
    System.out.println(c2);
    Calendar calendar=Calendar.getInstance();
    System.out.println(calendar);
  }
}
