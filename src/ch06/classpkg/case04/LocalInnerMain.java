package ch06.classpkg.case04;

public class LocalInnerMain {
  public static void main(String[] args) {
    OuterClass out=new OuterClass();

    Runnable runner=out.getRunnable(10);
    runner.run();
  }
}