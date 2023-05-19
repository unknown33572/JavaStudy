package ch03.quiz;

public class Test01 {
  public static void main(String[] args) {
    for(int i=0; i<3; i++){
      System.out.println(i+"외부");
      for(int j=0; j<i; j++){
        System.out.println(j+"내부");
      }
    }
  }
}
