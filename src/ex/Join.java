package ex;

public class Join {
  public static void main(String[] args) {
    int iVal = 100;
    //String strVal = String.valueOf(iVal);
    String strVal1 = iVal + ""; // String + int => String + String => String

    double dVal = 200.0;
    String strVal2 = dVal + ""; // String + double => String + String => String

    double sum = Integer.valueOf("+" + strVal1) + Double.valueOf(strVal2);

    double sum2 = Integer.valueOf(strVal1) + Double.valueOf(strVal2);

    System.out.println(String.join("", strVal1, "+", strVal2, "=", String.valueOf(sum)));

  }
}
