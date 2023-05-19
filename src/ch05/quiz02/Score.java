package ch05.quiz02;

public class Score {
  String name;
  int kor=0;
  int eng=0;
  int math=0;
  int sum=0;
  double avg;

  public int getSum() {
    return kor+eng+math;
  }

  public double getAvg() {
    return getSum()/3.0;
  }
}
