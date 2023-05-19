package ch05.interfacepkg.case02;

public class EqualsTest {
  public static void main(String[] args) {
    Worker w1=new Worker(1001, "John");
    Worker w2=new Worker(1001, "John");
    System.out.println(w1==w2);
    System.out.println(w1.equals(w2));
    String s1=new String("John");
    String s2=new String("John");
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));
  }
}