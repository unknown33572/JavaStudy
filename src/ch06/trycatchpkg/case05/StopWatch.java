package ch06.trycatchpkg.case05;

public abstract class StopWatch {
  long startTime;
  long endTime;

  abstract void start();
  abstract void stop();
  abstract long getElapsedTime();
  abstract void execute() throws InterruptedException;
}