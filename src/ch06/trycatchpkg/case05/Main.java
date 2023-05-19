package ch06.trycatchpkg.case05;

public class Main {
  public static void run(StopWatch s) throws InterruptedException {
    s.execute();
  }
  public static void main(String[] args) throws InterruptedException {
    MilliStopWatch ms = new MilliStopWatch();
    run(ms);
    System.out.println();
    NanoStopWatch ns = new NanoStopWatch();
    run(ns);
  }
}
