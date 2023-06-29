package ch07.case01;

public class Main {
  public static void main(String[] args) {
    Professor[] p = new Professor[3];
    MainService ms = new MainService();

    while(true) {
      int menu = ms.menu();

      switch(menu) {
      case 1:
        ms.input(p);
        break;
      case 2:
        ms.output(p);
        break;
      case 3:
        ms.modify(p);
        break;
      case 4:
        ms.delete(p);
        break;
      case 5:
        ms.restore(p);
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
