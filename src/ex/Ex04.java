package ex;

public class Ex04 {
  public static void main(String[] args) {
    Loop1 : for(int i = 2; i <= 9; i++) {
      for(int j = 1; j <= 9; j++) {
        if(j == 9) { // j가 9일 때
          break Loop1; // Loop1 for문을 정지하고 빠져나감.
        }
        System.out.println(i + " * " + j + " = " + i * j);
      }
    }
  }
}
