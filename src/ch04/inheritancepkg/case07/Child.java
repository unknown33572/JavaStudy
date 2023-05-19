package ch04.inheritancepkg.case07;

public class Child extends Parent{
  int a=10;
  @Override
  void output(){
    super.a=20;
    System.out.println("a: "+a);
    System.out.println("부모 a: "+super.a);
    System.out.println("자식 a: "+this.a);
  }
}
