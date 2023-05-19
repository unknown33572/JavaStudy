package ch06.trycatchpkg.case01;

import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    MilliStopWatch ms = new MilliStopWatch();

    ms.startTime = System.currentTimeMillis();
    System.out.println(ms.startTime);

    TimeUnit.SECONDS.sleep(10);

    ms.endTime = System.currentTimeMillis();
    System.out.println(ms.endTime);

    long mTime = ms.getElapsedTime();
    System.out.println("경과시간: "+mTime);
  }
}