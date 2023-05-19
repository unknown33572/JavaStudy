package ch06.trycatchpkg.case02;

public class StopWatch {
  long startTime;
  long endTime;

  public void startMilli() {
    startTime = System.currentTimeMillis();
  }
  public void endMilli() {
    endTime = System.currentTimeMillis();
  }
  public long getElapsedMilliTime() {
    return endTime=startTime;
  }

  long startNanoTime;
  long endNanoTime;

  public void startNano() {
    startNanoTime = System.nanoTime();
  }
  public void endNano() {
    endNanoTime = System.nanoTime();
  }
  public long getElapsedNanoTime() {
    return endNanoTime-startNanoTime;
  }
}