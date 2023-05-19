package ch06.trycatchpkg.case02;

import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    StopWatch s = new StopWatch();

    s.startMilli();
    System.out.println(s.startTime);

    for(long i=0; i<1000000000L; i++) {}

    s.endMilli();
    System.out.println(s.endTime);

    long mTime = s.getElapsedMilliTime();
    System.out.println("경과시간: "+mTime);

    System.out.println();

    s.startNano();
    System.out.println(s.startNanoTime);

    TimeUnit.SECONDS.sleep(3);

    s.endNano();
    System.out.println(s.endNanoTime);

    long nTime = s.getElapsedNanoTime();
    System.out.println("경과시간: "+nTime);
  }
}
