package ch05.quiz;

import java.util.Scanner;

public class StudentService {
  Scanner scanner=new Scanner(System.in);
  int cnt=0;
  public int menu() {
    System.out.println("1.입력");
    System.out.println("2.출력");
    System.out.println("0.종료");
    System.out.print("> ");
    return scanner.nextInt();
  }

  public void input(StudentChild[] stuChild) {
    if(cnt==stuChild.length){
      System.out.println("허용된 입력값이 다 찼습니다.");
    }else{
        stuChild[cnt]=new StudentChild();
        System.out.print("학번 입력: ");
        stuChild[cnt].setStuNum(scanner.next());
        System.out.print("이름 입력: ");
        stuChild[cnt].setStuName(scanner.next());
        System.out.print("학과 입력: ");
        stuChild[cnt].setStuMajor(scanner.next());
        System.out.print("성별 입력: ");
        stuChild[cnt].setStuGender(scanner.next());
        System.out.print("나이 입력: ");
        stuChild[cnt].setAge(scanner.nextInt());
        cnt++;
      }
  }

  public void output(StudentChild[] stuChild) {
    if(cnt==0){
      System.out.println("출력할 값이 없습니다.");
    }else{
      for(int i=0; i<cnt; i++){
        System.out.println("### "+stuChild[i].getStuNum()+" ###");
        System.out.println("학생 이름: "+stuChild[i].getStuName());
        System.out.println("학생 학과: "+stuChild[i].getStuMajor());
        System.out.println("학생 성별: "+stuChild[i].getStuGender());
        System.out.println("학생 나이: "+stuChild[i].getAge());
      }
    }
  }
}
