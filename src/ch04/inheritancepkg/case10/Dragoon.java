package ch04.inheritancepkg.case10;

public class Dragoon extends Protoss{

  public void attack(int x) {
    System.out.println("드라군의 공격"+x);
  }


  public void depense() {
    System.out.println("드라군의 방어");
  }
}
