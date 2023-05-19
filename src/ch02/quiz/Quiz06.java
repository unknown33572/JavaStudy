package ch02.quiz;

import java.util.Scanner;

public class Quiz06 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int dan=0;
    for (;;) {
      System.out.print("단 입력: ");
      dan=in.nextInt();
      for (int i=1; i<10; i++) {
        if (dan>=2 && 9>=dan) {
          System.out.println(dan + "*" + i + "=" + dan*i);
        } else if (dan==10) {
          System.out.println("종료");
          return;
        } else {
          System.out.println("출력할 수 없는 단 입니다.");
          break;
        }
      }
    }
  }
}
