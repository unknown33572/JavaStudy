package ch04.inheritancepkg.case10;

public class Starcraft {
  public static void main(String[] args) {
    Protoss p=new Protoss();
    Protoss dragoon=new Dragoon();
    Protoss zealot=new Zealot();
    dragoon.attack(1);
    dragoon.depense();
  }
}
