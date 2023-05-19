package ch04.inheritancepkg.case02;

public class Main {
  public static void main(String[] args) {
    Lion lion=new Lion();
    Tiger tiger=new Tiger();

    lion.run("사자");
    lion.hunt();
    tiger.run("호랑이");
  }
}
