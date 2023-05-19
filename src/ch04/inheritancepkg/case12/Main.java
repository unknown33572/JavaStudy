package ch04.inheritancepkg.case12;

public class Main {
  public static void main(String[] args) {
    Human human=new Human();
    Food ramen=new Ramen();
    Food kimchi=new Kimchi();

    human.eat(ramen);
    human.eat(kimchi);
  }
}
