package ch06.classpkg.case01;

public class OuterClass {
  private int num=100;
  private static int sNum=200;
  private InnerClass inClass;

  public OuterClass(){
    inClass=new InnerClass();
  }

  class InnerClass{
    int inNum=300;
    void showInnerInfo(){
      System.out.println("OuterClass num="+num);
      System.out.println("OuterClass sNum="+sNum);
      System.out.println("InnerClass inNum="+inNum);
    }
  }
  public void callInnerMethod(){
    inClass.showInnerInfo();
  }
}
