package ch04.inheritancepkg.case05;

public class Main {
  public static void main(String[] args) {
    Cat cat=new Cat("고냥이",4);
    System.out.printf("%s %d", cat.getAnimalName(),cat.getAge());
  }
}
