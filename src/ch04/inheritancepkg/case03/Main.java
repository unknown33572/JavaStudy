package ch04.inheritancepkg.case03;

public class Main {
  public static void main(String[] args) {
    Animal mammal=new Animal();
    mammal.showAnimalInfo();
    System.out.println();

    Cats tiger=new Cats();
    tiger.showAnimalInfo();
  }
}
