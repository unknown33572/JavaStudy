package ch06.trycatchpkg.case03;

public class NanoStopWatch {
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
