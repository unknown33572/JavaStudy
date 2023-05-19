package ch06.lamdapkg.case01;

public class AddTest {
  public static void main(String[] args) {
    Add add=(int x, int y)->x+y;

    System.out.println(add.add(10, 5));
  }
}
