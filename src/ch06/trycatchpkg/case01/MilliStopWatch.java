package ch06.trycatchpkg.case01;

public class MilliStopWatch {
  long startTime;
  long endTime;

  public long getElapsedTime(){
    return endTime - startTime;
  }
}
