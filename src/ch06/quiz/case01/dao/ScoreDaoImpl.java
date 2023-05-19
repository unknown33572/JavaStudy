package ch06.quiz.case01.dao;

import ch06.quiz.case01.domain.Score;

import java.util.Scanner;

public class ScoreDaoImpl implements ScoreDao{
  private Score[] scores;
  private int cursor;

  public ScoreDaoImpl(Score[] scores){
    this.scores=scores;
  }

  @Override
  public void setScore(Score score) {
    this.scores[cursor++]=score;
  }

  @Override
  public Score[] getScores() {
    return this.scores;
  }
}
