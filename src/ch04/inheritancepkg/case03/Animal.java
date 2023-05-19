package ch04.inheritancepkg.case03;

public class Animal {
  String species;
  String habitat;

  public Animal(){
    System.out.println("동물 소환");
  }

  public void showAnimalInfo(){
    System.out.println("이 메소드는 Animal클래스 객체와 Animal을 상속받은 객체가 사용가능");
  }
}