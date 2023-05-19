package ch04.quiz01;

public class Fruit {
  int price;
  int fruitCnt;

  public Fruit(int price,int fruitCnt){
    this.price=price;
    this.fruitCnt=fruitCnt;
  }

  public void output(String msg){
    System.out.printf("과일이름: %s 가격: %d 수량: %d\n", msg,this.price,this.fruitCnt);
  }
}
