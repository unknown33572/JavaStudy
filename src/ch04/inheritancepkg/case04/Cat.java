package ch04.inheritancepkg.case04;

public class Cat extends Animal{

  private int age;

  public Cat(){

  }

  public Cat(String animalName, int age){
    super(animalName);
    this.age=age;
  }
  public int getAge(){
    return age;
  }
}
