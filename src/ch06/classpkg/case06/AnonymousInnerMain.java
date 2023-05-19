package ch06.classpkg.case06;

class OuterClass{
  Runnable runnable=new Runnable(){
    @Override
      public void run() {
        System.out.println("Runnable Class");
      }
    };
  }
public class AnonymousInnerMain {
  public static void main(String[] args) {
    OuterClass out=new OuterClass();
    out.runnable.run();
  }
}