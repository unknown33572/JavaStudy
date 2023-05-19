package ch06.quiz.case01;

import ch06.quiz.case01.dao.ScoreDao;
import ch06.quiz.case01.dao.ScoreDaoImpl;
import ch06.quiz.case01.domain.Score;
import ch06.quiz.case01.presentation.Console;
import ch06.quiz.case01.presentation.Score.ScoreIo;
import ch06.quiz.case01.service.ScoreService;
import ch06.quiz.case01.service.ScoreServiceImpl;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int studentCount=0;
    studentCount= Console.inNumber("학생 수 입력");
    Score[]scores=new Score[studentCount];

    ScoreDao scoreDao=new ScoreDaoImpl(scores);
    ScoreService scoreService=new ScoreServiceImpl(scoreDao);
    ScoreIo scoreIo=new ScoreIo(scoreService);

    scoreIo.run(studentCount);
    Console.showInfo("End");
  }
}