package ch05.quiz04;

import java.util.Scanner;

public class ScoreService {
  Scanner sc=new Scanner(System.in);
  int cnt=0;
  public void input(Score[] s) {
    if(s.length==cnt){
      System.out.println("입력이 불가능 합니다.");
    }else{
      s[cnt]=new Score();
      System.out.print("이름 입력: ");
      s[cnt].setStuName(sc.next());
      System.out.print("학과 입력: ");
      s[cnt].setStuMajor(sc.next());
      System.out.print("성적 입력: ");
      s[cnt].setStuScore(sc.nextInt());
      cnt++;
    }
  }

  public void output(Score[] s) {
    if(cnt==0){
      System.out.println("출력할 내용이 없습니다.");
    }else{
      for(int i=0; i<cnt; i++){
        System.out.println("### "+s[i].getStuName()+" ###");
        System.out.println("학과: "+s[i].getStuMajor());
        System.out.println("성적: "+s[i].getStuScore());
      }
    }
  }

  public void modify(Score[] s) {
    if(cnt==0){
      System.out.println("수정할 내용이 없습니다.");
    }else{
      System.out.print("수정할 이름 입력: ");
      String name=sc.next();
      for(int i=0; i<cnt; i++){
        if(name.equals(s[i].getStuName())){
          System.out.print("학과 수정: ");
          s[i].setStuMajor(sc.next());
          System.out.print("점수 수정: ");
          s[i].setStuScore(sc.nextInt());
          break;
        }
      }
    }
  }

  public void delete(Score[] s) {
    if(cnt==0){
      System.out.println("삭제할 내용이 없습니다.");
    }else{
      System.out.print("삭제할 이름 입력: ");
      String name= sc.next();
      cnt--;
      for(int i=0; i<cnt; i++){
        if(name.equals(s[i].getStuName())){
          System.out.println(name + "님의 정보를 삭제합니다.");
          for(int j=i; j<cnt; j++){
            s[j]=s[j+1];
          }
          break;
        }
        if(i==cnt-1){
          System.out.println("삭제할 이름을 찾을 수 없습니다.");
        }
      }
    }
  }
}
