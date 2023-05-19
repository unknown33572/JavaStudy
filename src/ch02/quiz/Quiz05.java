package ch02.quiz;

import java.util.Scanner;

public class Quiz05 {
  public static void main(String[] args) {
//    for (int i=1; i<=100; i++) {
//      if (i%5==0) {
//        System.out.println(i);
//      }
//    }
    Scanner input=new Scanner(System.in);
    int menu=0;
    for (;;) {

      System.out.println("1. 입력");
      System.out.println("2. 출력");
      System.out.println("0. 종료");
      System.out.print("선택: ");
      menu=input.nextInt();

      boolean end=false;
      switch (menu) {
        case 1:
          System.out.println("입력 페이지 입니다.");
          break;
        case 2:
          System.out.println("출력 페이지 입니다.");
          break;
        case 0:
          System.out.println("프로그램 종료");
//          return;
          end=true;
          break;
        default:
          System.out.println("없는 메뉴 입니다.");
      }
      if (end){
        break;
      }
    }
  }
}
