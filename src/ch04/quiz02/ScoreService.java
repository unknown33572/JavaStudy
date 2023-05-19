package ch04.quiz02;

import java.util.Scanner;

public class ScoreService {
  Scanner sc=new Scanner(System.in);
  int cnt=0;

  public int menu() {
    System.out.println("1. 입력");
    System.out.println("2. 출력");
    System.out.println("0. 종료");
    return sc.nextInt();
  }

  public void input(ScoreChild[] scoreChild) {
    if(cnt== scoreChild.length){
      System.out.println("더 이상 저장할 수 없습니다.");
    }else{
      scoreChild[cnt]=new ScoreChild();
      System.out.print("이름 입력: ");
      scoreChild[cnt].setName(sc.next());
      System.out.print("국어 점수 입력: ");
      scoreChild[cnt].setKor(sc.nextInt());
      System.out.print("영어 점수 입력: ");
      scoreChild[cnt].setEng(sc.nextInt());
      System.out.print("수학 점수 입력: ");
      scoreChild[cnt].setMath(sc.nextInt());
      System.out.print("음악 점수 입력: ");
      scoreChild[cnt].setMusic(sc.nextInt());
      System.out.print("체육 점수 입력: ");
      scoreChild[cnt].setPhysical(sc.nextInt());

      scoreChild[cnt].setSum();
      scoreChild[cnt].setAvg();
      cnt++;
    }
  }

  public void output(ScoreChild[] score) {
    if(cnt==0){
      System.out.print("출력할 데이터가 없습니다.");
    }else{
      for(int i=0; i<cnt; i++){
        System.out.println(score[i].toString());
      }
    }
  }
}
