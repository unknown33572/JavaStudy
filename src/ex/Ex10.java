package ex;

public class Ex10 {
  public static void main(String[] args) {
    System.out.println(MyMath2.add2(3, 4)); // static 메소드는 객체를 만들지 않고 클래스 이름으로도 호출 가능

    MyMath2 mM2 = new MyMath2();

    mM2.a = 5;
    mM2.b = 4;

    System.out.println(mM2.add()); // 인스턴스 메소드는 객체를 만들어서 호출해야 함
  }
}