package ch02.loop;

public class C02While {
  public static void main(String[] args) {
    while (true) {
      System.out.println("a");
      break;
    }
    boolean flag=true;
    int i=0;
    while(flag){
      System.out.println("1");
      i++;
      if(i==5) {
        flag=false;
      }
    }
    while(!(i==10)){ //위에 i가 ++ 돼서 5임 그래서 실행결과 2는 다섯번 출력됨
      i++;
      System.out.println("2");
    }
  }
}
