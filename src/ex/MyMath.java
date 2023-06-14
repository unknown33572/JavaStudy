package ex;

public class MyMath {
  long add(long x, long y) {
    return x + y;
  }

  long subtract(long x, long y) {
    return x - y;
  }

  long multiply(long x, long y) {
    return x * y;
  }

  double divide(double x, double y) {
    return x / y;
  }

  long max(long x, long y) {
    if(x>y) {
      return x;
    }else {
      return y;
    }
  }

  long min(long x, long y) {
    return x<y?x:y;
  }

  void gugudan(int x) {
    if(!(2 <= x && x <= 9)) {
      return;
    }
    for(int i=1; i<=9; i++) {
      System.out.println(x + " * " + i + " = " + x*i);
    }
  }
}