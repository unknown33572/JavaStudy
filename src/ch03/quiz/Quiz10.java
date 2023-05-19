package ch03.quiz;

public class Quiz10 {
  public static void main(String[] args) {
    int[][]scores={
        {90,90,90},
        {80,80,80},
        {70,70,90},
        {90,60,60},
        {90,80,50},
    };
    System.out.println("번호 국어 영어 수학 합계 평균");
    System.out.println("----------------------");
    for(int i=0; i<scores.length; i++){
      System.out.print(i+1);
      int sum=0;
      for(int j=0; j<scores[i].length; j++){
        sum+=scores[i][j];
        System.out.printf("\t%d", scores[i][j]);
      }
      System.out.printf("\t%d %d\n", sum,sum/scores[i].length);
    }
  }
}
