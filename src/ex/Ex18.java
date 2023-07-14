package ex;

public class Ex18 {
  static long startTime = 0;

  public static void main(String[] args) {
    ThreadEx18_1 th1 = new ThreadEx18_1();
    ThreadEx18_2 th2 = new ThreadEx18_2();

    th1.start();
    th2.start();
    startTime = System.currentTimeMillis();

    try {
      th1.join();
      th2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("소요시간: " + (System.currentTimeMillis() - Ex18.startTime));
  }

  static class ThreadEx18_1 extends Thread {
    public void run() {
      for(int i=0; i<300; i++) {
        System.out.print("-");
        if(i%100==0) System.out.println();
      }
    }
  }

  static class ThreadEx18_2 extends Thread {
    public void run() {
      for(int i=0; i<300; i++) {
        System.out.print("|");
        if(i%100==0) System.out.println();
      }
    }
  }
}
