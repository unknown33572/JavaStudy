package ch04.inheritancepkg.case10;

public class Zealot extends Protoss{
  @Override
  public void attack(int x) {
    super.attack(x);
    System.out.println("질럿의 공격");
  }

  @Override
  public void depense() {
    super.depense();
    System.out.println("질럿의 방어");
  }

  public void move(){
    System.out.println("질럿이 움직인다.");
  }
}
