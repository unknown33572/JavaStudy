package ch07.case01;

import java.util.Scanner;

public class MainService {
  Scanner sc = new Scanner(System.in);
  ProfServ ps;

  public MainService() {
    ps = new ProfServ();
  }

  public int menu() {
    System.out.println("1. 입력");
    System.out.println("2. 출력");
    System.out.println("3. 수정");
    System.out.println("4. 삭제");
    System.out.println("5. 복구");
    System.out.println("0. 종료");
    System.out.print("> ");
    return sc.nextInt();
  }

  public int subMenu(String str) {
    System.out.println("1. 교수진" + str);
    int select = sc.nextInt();
    return select;
  }

  public void input(Professor[] p) {
    int select = subMenu("입력");

    switch(select) {
    case 1:
      ps.input(p);
      break;
    default:
      System.out.println("선택된 메뉴가 없습니다.");
    }
  }

  public void output(Professor[] p) {
    int select = subMenu("출력");

    switch(select) {
    case 1:
      ps.output(p);
      break;
    default:
      System.out.println("선택된 메뉴가 없습니다.");
    }
  }

  public void modify(Professor[] p) {
    int select = subMenu("수정");

    switch(select) {
    case 1:
      ps.modify(p);
      break;
    default:
      System.out.println("선택된 메뉴가 없습니다.");
    }
  }

  public void delete(Professor[] p) {
    int select = subMenu("삭제");

    switch(select) {
    case 1:
      ps.delete(p);
      break;
    default:
      System.out.println("선택된 메뉴가 없습니다.");
    }
  }

  public void restore(Professor[] p) {
    int select = subMenu("복구");

    switch(select) {
    case 1:
      ps.restore(p);
      break;
    default:
      System.out.println("선택된 메뉴가 없습니다.");
    }
  }
}
