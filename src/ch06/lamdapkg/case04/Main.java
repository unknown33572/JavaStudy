package ch06.lamdapkg.case04;

public class Main {
  public static void main(String[] args) {
    String s1="Hello";
    String s2="World";

    StringConcatImpl concat=new StringConcatImpl();
    concat.concatString(s1, s2);

    StringConcat concat2=(x,y)-> System.out.println(x+y);
    concat2.concatString(s1,s2);
  }
}
