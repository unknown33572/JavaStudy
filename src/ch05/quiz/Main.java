package ch05.quiz;

public class Main {
  public static void main(String[] args) {
    StudentChild[] stuChild=new StudentChild[3];
    StudentService stuService =new StudentService();

    while(true){
      int menu=stuService.menu();
      switch(menu){
        case 0:
          System.out.println("프로그램 종료");
          return;
        case 1:
          stuService.input(stuChild);
          break;
        case 2:
          stuService.output(stuChild);
          break;
        default:
          System.out.println("없는 메뉴 입니다.");
      }
    }
  }
}
