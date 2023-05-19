package ch06.trycatchpkg.case03;

public class MilliStopWatch {
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
}
