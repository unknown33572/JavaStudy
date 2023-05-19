package ch04.quiz02;

public class ScoreMain {
  public static void main(String[] args) {
    ScoreChild[] score=new ScoreChild[5];
    ScoreService ss=new ScoreService();
    while(true){
      int menu=ss.menu();
      switch(menu){
        case 0:
          System.out.println("프로그램 종료");
          return;
        case 1:
          ss.input(score);
          break;
        case 2:
          ss.output(score);
          break;
        default:
          System.out.print("없는 메뉴입니다.");
      }
    }
  }
}
