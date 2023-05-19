package ch06.lamdapkg.case06;

public class Main {
  public static void main(String[] args) {
    PrintString str = s -> System.out.println(s);
    str.printString("hi");
    showString(str);
  }
  public static void showString(PrintString p){
    p.printString("매개변수로 람다식 전달");
  }
}