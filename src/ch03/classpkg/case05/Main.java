package ch03.classpkg.case05;

public class Main {
  public static void main(String[] args) {
    Apple apple=new Apple();
    apple.setPrice(1000);

    Basket basket=new Basket();
    basket.setApple(apple);
    System.out.print(basket.getApple().getPrice());
  }
}
