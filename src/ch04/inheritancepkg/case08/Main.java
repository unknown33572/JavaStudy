package ch04.inheritancepkg.case08;

public class Main {
  public void moveAnimal(Animal animal){
    animal.move();
  }
  public static void main(String[] args) {
    Animal lion=new Lion(); //up casting
    Animal falcon=new Falcon();
    Main m=new Main();
    m.moveAnimal(lion);
    m.moveAnimal(falcon);
  }
}
