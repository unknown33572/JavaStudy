package ex;

public class Buyer {
  int money = 0;
  int bonusPoint = 0;

  public Buyer(int money) {
    this.money = money;
  }

  public void buy(Product p) {
    if (money < p.price) {
      System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
      return;
    }

    money -= p.price;
    bonusPoint += p.bonusPoint;
    System.out.println(p + "을/를 구입하셨습니다.");
  }
}
