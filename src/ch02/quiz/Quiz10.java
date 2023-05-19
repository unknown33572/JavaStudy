package ch02.quiz;

public class Quiz10 {
  public static void main(String[] args) {
    int i=0;
    int sum1=0;
    while(i<100){
      i++;
      sum1+=i;
    }
    System.out.println(sum1);

    int sum2=0;
    for (int j=0; j<101; j++){
      sum2+=j;
    }
    System.out.println(sum2);
  }
}
