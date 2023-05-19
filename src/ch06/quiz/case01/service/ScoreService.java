package ch06.quiz.case01.service;

import ch06.quiz.case01.domain.Score;

public interface ScoreService {
  void addScore(Score score);
  Score[] listScores();
}
