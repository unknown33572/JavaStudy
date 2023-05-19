package ch06.lamdapkg.case04;

public class StringConcatImpl implements StringConcat{
  @Override
  public void concatString(String s1, String s2) {
    System.out.println(s1+s2);
  }
}
