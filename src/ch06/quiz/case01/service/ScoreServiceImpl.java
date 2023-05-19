package ch06.quiz.case01.service;

import ch06.quiz.case01.dao.ScoreDao;
import ch06.quiz.case01.domain.Score;

public class ScoreServiceImpl implements ScoreService{
  private ScoreDao scoreDao;

  public ScoreServiceImpl(ScoreDao scoreDao){
    this.scoreDao=scoreDao;
  }

  @Override
  public void addScore(Score score) {
    this.scoreDao.setScore(score);
  }

  @Override
  public Score[] listScores() {
    Score[] scores=this.scoreDao.getScores();
    int sum=0;
    double average=0;

    for(Score score:scores){
      sum=score.getKor()+ score.getEng()+ score.getMath();
      average=sum/3.0;
      score.setSum(sum);
      score.setAvg(average);
    }
    return scores;
  }
}
