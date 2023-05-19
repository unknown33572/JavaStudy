package ch02.quiz;

import java.util.Scanner;

public class Quiz11 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    int num1=0;
    int num2=0;
    int result;
    char cal;
    char choice;
    boolean flag=false;

    do {
      System.out.print("숫자1: ");
      num1=input.nextInt();
      System.out.print("연산자: ");
      cal=input.next().charAt(0);
      System.out.print("숫자2: ");
      num2=input.nextInt();
      if (cal=='+'){
        result=num1+num2;
        System.out.println(num1 +"+"+ num2 +"="+ result);
      } else if (cal=='-') {
        result=num1-num2;
        System.out.println(num1 +"-"+ num2 +"="+ result);
      } else if (cal=='*') {
        result=num1*num2;
        System.out.println(num1 +"*"+ num2 +"="+ result);
      } else if (cal=='/') {
        result=num1/num2;
        System.out.println(num1 +"/"+ num2 +"="+ result);
      }
      System.out.println("계속 할까요? (Y/N)");
      choice=input.next().charAt(0);
      if(choice=='Y'){
        System.out.println("프로그램을 재시작 합니다.");
      } else if (choice=='N'){
        flag=true;
      } else {
        System.out.println("ERROR] Y/N 으로만 입력하세요.");
      }
    }while(!flag);
  }
}
