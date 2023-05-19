package ch04.inheritancepkg.case05;

public class Cat extends Animal{
  private int age;

  public Cat(String animalName, int age){
    super(animalName);
    this.age=age;
  }

  public Cat(String animalName){
    super(animalName);
  }

  public Cat(int age){
    this.age=age;
  }

  public int getAge(){
    return age;
  }
}
