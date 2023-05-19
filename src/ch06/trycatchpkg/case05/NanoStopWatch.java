package ch06.trycatchpkg.case05;

import java.util.concurrent.TimeUnit;

public class NanoStopWatch extends StopWatch {
  @Override
  void start() {
    startTime = System.nanoTime();
  }

  @Override
  void stop() {
    endTime = System.nanoTime();
  }

  @Override
  long getElapsedTime() {
    return endTime-startTime;
  }

  @Override
  void execute() throws InterruptedException {
    start();
    System.out.println(startTime);
    TimeUnit.SECONDS.sleep(1);
    stop();
    System.out.println(endTime);
    long nTime = getElapsedTime();
    System.out.printf("경과시간: %d\n", nTime);
  }
}