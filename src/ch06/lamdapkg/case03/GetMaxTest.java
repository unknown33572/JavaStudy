package ch06.lamdapkg.case03;

public class GetMaxTest {
  public static void main(String[] args) {
    GetMax max=(x, y)->{
      if(x>y)return x;
      else return y;
    };
    System.out.println(max.getMax(10, 20));
    GetMax max2=(x,y)->(x>y)?x:y;
    System.out.println(max2.getMax(20, 30));
  }
}