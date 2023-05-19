package ch04.inheritancepkg.case06;

public class Main {
  public static void main(String[] args) {
    Lion lion=new Lion();
    Falcon falcon=new Falcon();
    Human human=new Human();

    lion.move();
    falcon.move();
    human.move();

    lion.hunt();
    falcon.peckAt();
    human.read();
  }
}
