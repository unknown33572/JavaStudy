package ch03.quiz;

import java.util.Scanner;

public class Quiz05 {
  static Scanner in=new Scanner(System.in);
  static int add(int x,int y){
    return x+y;
  }
  static int sub(int x,int y){
    return x-y;
  }
  static int mul(int x,int y){
    return x*y;
  }
  static int div(int x,int y){
    return x/y;
  }
  static void print(String str){
    System.out.print(str+" 정수 입력: ");
  }
  public static void main(String[] args) {
    int x=0;
    int y=0;
    while(true){
      System.out.print("1.더하기 2.빼기 3.곱하기 4.나누기 0.종료\n> ");
      int menu=in.nextInt();
      switch(menu){
        case 1:
          print("첫 번째");
          x=in.nextInt();
          print("두 번째");
          y=in.nextInt();
          System.out.println("두 수의 합: "+add(x,y));
          break;
        case 2:
          print("첫 번째");
          x=in.nextInt();
          print("두 번째");
          y=in.nextInt();
          System.out.println("두 수의 차: "+sub(x,y));
          break;
        case 3:
          print("첫 번째");
          x=in.nextInt();
          print("두 번째");
          y=in.nextInt();
          System.out.println("두 수의 곱: "+mul(x,y));
          break;
        case 4:
          print("첫 번째");
          x=in.nextInt();
          print("두 번째");
          y=in.nextInt();
          System.out.println("두 수의 제: "+div(x,y));
          break;
        case 0:
          System.out.print("프로그램 종료");
          return;
      }
    }
  }
}
