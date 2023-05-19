package ch06.classpkg.case02;

public class OuterClass {
  private int num=100;
  private static int sNum=200;
  private InnerClass inClass;

  public OuterClass(){
    inClass=new InnerClass();
  }

  static class InnerClass{ // static 내부 클래스
    int inNum=300;
    static int sInnum=600;
    void showInnerInfo(){ // static 클래스의 일반 메소드
//      System.out.println("OuterClass num="+num);
      System.out.println("OuterClass sNum="+sNum);
      System.out.println("InnerClass inNum="+inNum);
    }
    static void showInnerInfo2(){
//      num=500;
//      inNum=400;
      System.out.println("OuterClass sNum="+sNum);
      System.out.println("StaticInnerClass sInnum="+sInnum);
    }
  }
  public void callInnerMethod(){
    inClass.showInnerInfo();
  }
}