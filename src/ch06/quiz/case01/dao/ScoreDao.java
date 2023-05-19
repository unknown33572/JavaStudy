package ch06.quiz.case01.dao;

import ch06.quiz.case01.domain.Score;

public interface ScoreDao {
  void setScore(Score score);
  Score[] getScores();
}