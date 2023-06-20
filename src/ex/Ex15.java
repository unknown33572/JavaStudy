package ex;

public class Ex15 {
  public static void main(String[] args) {
    Buyer b = new Buyer(1000);
    b.buy(new Desktop());
    b.buy(new Laptop());

    Product p = new Desktop();
    Product p2 = new Laptop();
    b.buy(p);
    b.buy(p2);
    System.out.println("잔액: " + b.money);
    System.out.println("보너스: " + b.bonusPoint);
  }
}
