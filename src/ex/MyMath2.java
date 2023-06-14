package ex;

public class MyMath2 {
  long a, b; // 인스턴스 변수

  long add() {
    return a + b;
  }

  static long add2(long a, long b) { // long a, long b는 지역 변수
    return a + b;
  }
}
