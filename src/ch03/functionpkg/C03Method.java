package ch03.functionpkg;

import java.util.Scanner;

public class C03Method {
  static void subject(){
    System.out.println("계산기 프로그램");
  }
  static int input(String str){
    Scanner in=new Scanner(System.in);
    System.out.print(str+" 정수 입력: ");
    return in.nextInt();
  }
  static int add(int a,int b){
    return a+b;
  }
  static void output(int a){
    System.out.println("두 수의 합: "+a);
  }

  public static void main(String[] args) {
    subject();
    int num1=input("첫 번째");
    int num2=input("두 번째");
    int sum=add(num1, num2);
    output(sum);
  }
}
