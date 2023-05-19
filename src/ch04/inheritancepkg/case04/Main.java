package ch04.inheritancepkg.case04;

public class Main {
  public static void main(String[] args) {
    Cat cat=new Cat("애옹이", 5);
    System.out.printf("%s, %d", cat.getAnimalName(),cat.getAge());
  }
}
