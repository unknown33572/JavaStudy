package ch05.quiz02;

public class ScoreMain {
  public static void main(String[] args) {
    Score[] s=new Score[5];
    ScoreService ss=new ScoreService();
    int cnt=0;
    while(true){
      int menu=ss.menu();
      switch(menu){
        case 0:
          System.out.println("프로그램 종료");
          return;
        case 1:
          ss.input(s);
          break;
        case 2:
          ss.output(s);
          break;
        case 3:
          ss.modify(s);
          break;
        case 4:
          ss.delete(s);
          break;
        default:
          System.out.println("없는 메뉴 입니다.");
      }
    }
  }
}