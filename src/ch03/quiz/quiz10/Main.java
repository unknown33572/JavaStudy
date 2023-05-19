package ch03.quiz.quiz10;

public class Main {
  public static void main(String[] args) {
    Farmer farmer=new Farmer();
    Seller seller=new Seller();

    Apple apple=seller.sell(farmer.sell(1000));
    System.out.print(apple.getApple());
  }
}
