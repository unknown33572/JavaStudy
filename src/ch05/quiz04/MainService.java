package ch05.quiz04;

import java.util.Scanner;

public class MainService {
  Scanner sc=new Scanner(System.in);
  ScoreService ss;
  ProfessorService ps;

  public MainService(){
    ss=new ScoreService();
    ps=new ProfessorService();
  }

  public int subMenu(String str){
    System.out.println("1.학생 "+str+" 2.교수진 "+str);
    int menu=sc.nextInt();
    return menu;
  }

  public int menu() {
    boolean flag=false;
    int sel = 0;
    while(!flag){
      System.out.println("1.입력 2.출력 3.수정 4.삭제");
      System.out.print("> ");
      String menu = sc.next();
      if (menu.length() == 1 && menu.charAt(0)>'0'&&menu.charAt(0)<='4') {
        sel = Integer.parseInt(menu);
        flag=true;
      } else {
        System.out.println("선택 가능한 번호가 아닙니다.");
      }
    }
    return sel;
  }

  public void input(Score[] s, Professor[] p) {
    int select=subMenu("입력");
    switch(select){
      case 1:
        ss.input(s);
        break;
      case 2:
        ps.input(p);
        break;
      default:
        System.out.println("선택된 메뉴가 없습니다.");
    }
  }

  public void output(Score[] s, Professor[] p) {
    int select=subMenu("출력");
    switch(select){
      case 1:
        ss.output(s);
        break;
      case 2:
        ps.output(p);
        break;
      default:
        System.out.println("선택된 메뉴가 없습니다.");
    }
  }

  public void modify(Score[] s, Professor[] p) {
    int select=subMenu("수정");
    switch(select){
      case 1:
        ss.modify(s);
        break;
      case 2:
        ps.modify(p);
        break;
      default:
        System.out.println("선택된 메뉴가 없습니다.");
    }
  }

  public void delete(Score[] s, Professor[] p) {
    int select=subMenu("삭제");
    switch(select){
      case 1:
        ss.delete(s);
        break;
      case 2:
        ps.delete(p);
        break;
      default:
        System.out.println("선택된 메뉴가 없습니다.");
    }
  }
}
