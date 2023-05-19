package ch03.quiz.quiz13;

import java.util.Scanner;

public class StudentMain {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    StudentService ss=new StudentService();
    Student[]s=new Student[5];
    int cnt=0;

    while(true){
      int menu=ss.menu();

      switch(menu){
        case 0:
          System.out.println("종료");
          return;
        case 1:
          cnt=ss.input(cnt, s);
          break;
        case 2:
          ss.output(cnt, s);
          break;
        case 3:
          ss.modify(cnt, s);
          break;
        case 4:
          cnt=ss.delete(cnt, s);
          break;
        default:
          System.out.println("오류");
      }
    }
  }
}
