package ch03.quiz;

import java.util.Scanner;

class Dice{
  int roll(){
    return (int)(Math.random()*6)+1;
  }
  void check(String x){
    while(true){
      if(x.charAt(0)=='Y'||x.charAt(0)=='y'){
        System.out.println("주사위를 굴립니다.");
        System.out.println(roll());
        continue;
      } else if(x.charAt(0)=='N'||x.charAt(0)=='n') {
        System.out.print("주사위를 굴리지 않습니다.");
        return;
      }
    }
  }
}

public class Quiz08 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String choice;
    Dice dice=new Dice();
    System.out.print("주사위를 굴릴까요?(Y/N)");
    choice=in.next();
    dice.check(choice);
  }
}
//반복 멈추는 방법을 못찾음