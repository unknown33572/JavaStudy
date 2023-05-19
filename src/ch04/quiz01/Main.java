package ch04.quiz01;

public class Main {
  public static void main(String[] args) {
    Fruit banana=new Banana(1000,10);
    Fruit apple=new Apple(2000,15);

    banana.output("바나나");
    apple.output("사과");
  }
}
