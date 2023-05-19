package ch06.trycatchpkg.case05;

public class MilliStopWatch extends StopWatch {
  @Override
  void start() {
    startTime = System.currentTimeMillis();
  }

  @Override
  void stop() {
    endTime = System.currentTimeMillis();
  }

  @Override
  long getElapsedTime() {
    return endTime-startTime;
  }

  @Override
  void execute() {
    start();
    System.out.println(startTime);
    for(long i=0; i<1000000000; i++) {}
    stop();
    System.out.println(endTime);
    long mTime = getElapsedTime();
    System.out.printf("경과시간: %d\n", mTime);
  }
}
