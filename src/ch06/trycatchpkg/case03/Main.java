package ch06.trycatchpkg.case03;

import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    MilliStopWatch ms = new MilliStopWatch();

    ms.startMilli();
    System.out.println(ms.startTime);
    for(long i=0; i<100000000; i++) {}
    ms.endMilli();
    System.out.println(ms.endTime);
    long mTime = ms.getElapsedMilliTime();
    System.out.printf("경과시간: %d", mTime);
    System.out.println();
    NanoStopWatch ns = new NanoStopWatch();
    ns.startNano();
    System.out.println(ns.startNanoTime);
    TimeUnit.SECONDS.sleep((long) 0.5);
    ns.endNano();
    System.out.println(ns.endNanoTime);
    long nTime = ns.getElapsedNanoTime();
    System.out.printf("경과시간: %d", nTime);
  }
}