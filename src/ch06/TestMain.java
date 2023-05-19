package ch06;
import java.util.Scanner;
public class TestMain {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int m=sc.nextInt();
    if(h>=0&&h<=23 && m>=0&&m<=59){
      m-=45;
      if(m<0) {
        m += 60;
        h--;
        if (h < 0) {
          h += 24;
        }
      }
      System.out.printf("%d %d", h, m);
    }else{
      System.out.println("잘못된 입력입니다.");
    }
  }
}