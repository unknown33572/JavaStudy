package ex;

public class RountTest {
  public static void main(String[] args) {
    int i = Integer.parseInt("100");
    System.out.println(i);
    System.out.println(Integer.parseInt("100", 2)); // 2진수 100을 10진수로 변환 아래도 8진수, 16진수
    System.out.println(Integer.parseInt("100", 8));
    System.out.println(Integer.parseInt("100", 16));
  }
}
