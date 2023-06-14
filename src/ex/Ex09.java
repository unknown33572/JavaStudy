package ex;

public class Ex09 {
  public static void main(String[] args) {
    MyMath myMath = new MyMath();

    System.out.println("더하기: " + myMath.add(3, 4));
    System.out.println("빼기: " + myMath.subtract(3, 4));
    System.out.println("곱하기: " + myMath.multiply(3, 4));
    System.out.println("나누기: " + myMath.divide(3, 4));
    System.out.println("최대값: " + myMath.max(3, 4));
    System.out.println("최소값: " + myMath.min(3, 4));
    System.out.println();
    myMath.gugudan(3);
  }
}
