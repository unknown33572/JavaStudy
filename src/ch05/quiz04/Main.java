package ch05.quiz04;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("학생 수 입력: ");
    int stuNum=in.nextInt();
    System.out.print("교수진 수 입력: ");
    int profNum=in.nextInt();
    Score[] s=new Score[stuNum];
    Professor[] p=new Professor[profNum];
    MainService ms=new MainService();
    while(true){
      int menu=ms.menu();
      switch(menu){
        case 1:
          ms.input(s,p);
          break;
        case 2:
          ms.output(s,p);
          break;
        case 3:
          ms.modify(s,p);
          break;
        case 4:
          ms.delete(s,p);
          break;
        case 0:
          System.out.println("프로그램 종료");
          return;
        default:
          System.out.println("선택된 메뉴가 없습니다.");
      }
    }
  }
}