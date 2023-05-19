package ch06.classpkg.case03;

public class OuterClass {
  int outNum=100;

  Runnable getRunnable(int x){
    int localNum=200;

    class LocalInner implements Runnable{ // local inner class
      int innerNum=300;
      @Override
      public void run() {
        System.out.println("OuterClass의 outNum=" + outNum);
        System.out.println("Method 매개변수 x=" + x);
        System.out.println("Method 안의 num=" + localNum);
        System.out.println("LocalInner의 innerNum=" + innerNum);
      }
    }
    return new LocalInner();
  }
}