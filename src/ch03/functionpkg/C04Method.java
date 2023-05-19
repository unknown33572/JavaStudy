package ch03.functionpkg;

import java.util.Scanner;

public class C04Method {
  int a;
  int b;
  static Scanner in=new Scanner(System.in);

  static void print(String msg){
    System.out.println(msg);
  }
  static int add(int x,int y){
    return x+y;
  }
  static double avg(int x,int y){
    int sum=add(x,y);
    double result=sum/2.0;
    return result;
  }
  static void process(int x, int y){
    double result=avg(x,y);
    print("계산결과: "+result);
  }

  public static void main(String[] args) {
    print("첫 번째 정수 입력: ");
    int x=in.nextInt();
    print("두 번째 정수 입력: ");
    int y=in.nextInt();
    process(x, y);
  }
}
