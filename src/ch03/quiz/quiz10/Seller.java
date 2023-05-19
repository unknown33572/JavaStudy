package ch03.quiz.quiz10;

public class Seller {
  public Apple sell(Apple apple){
    apple.setApple(apple.getApple()*2);
    return apple;
  }
}
