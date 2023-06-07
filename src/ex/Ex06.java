package ex;

public class Ex06 {
  public static void main(String[] args) {
    int[] score;
    score = new int[5];
    score[0] = 50;
    score[1] = 60;
    score[2] = 70;
    score[3] = 80;
    score[4] = 90;

    for(int i = 0; i < score.length; i++) {
      System.out.println("score[" + i + "] = " + score[i]);
    }

    int arrayLength = score.length;
    System.out.println("arrayLength = " + arrayLength); // 배열의 길이
  }
}
