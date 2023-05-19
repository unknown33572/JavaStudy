package ch06.classpkg.case05;

class OuterClass{
  Runnable getRunnable(){
    return new Runnable(){ //익명 내부 클래스(anonymous inner class)
      @Override
      public void run() {
        System.out.println("Runnable Class");
      }
    };
  }
}
public class AnonymousInnerMain {
  
}
