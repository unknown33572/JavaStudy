package ch06.classpkg.case01;

public class InnerClassMain {
  public static void main(String[] args) {
    OuterClass out=new OuterClass();
    out.callInnerMethod();
    System.out.println();
    OuterClass.InnerClass inClass=out.new InnerClass();
    inClass.showInnerInfo();
  }
}