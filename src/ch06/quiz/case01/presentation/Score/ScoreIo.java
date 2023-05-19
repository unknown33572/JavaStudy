package ch06.quiz.case01.presentation.Score;

import ch06.quiz.case01.domain.Score;
import ch06.quiz.case01.presentation.Console;
import ch06.quiz.case01.service.ScoreService;

public class ScoreIo {
  private ScoreService scoreService;

  public ScoreIo(ScoreService scoreService){
    this.scoreService=scoreService;
  }

  public void run(int studentCount){
    Console.showInfo("점수 입력을 시작합니다.");

    Score score=null;
    for(int i=0; i<studentCount; i++){
      Console.showInfo((i+1)+"번째 학생입니다.");
      score=new Score();
      score.setNum(i+1);
      score.setKor(Console.inNumber("국어 입력"));
      score.setEng(Console.inNumber("영어 입력"));
      score.setMath(Console.inNumber("수학 입력"));

      scoreService.addScore(score);
    }
    Console.showInfo("점수 입력이 끝났습니다.");
    this.printScores();
  }
  private void printScores(){
    Score[] scores=scoreService.listScores();
    Console.showInfo("번호\t국어\t영어\t수학\t합계\t평균");
    Console.showInfo("-----------------------------------------");

    for(Score score:scores){
      Console.showInfo(score);
    }
  }
}