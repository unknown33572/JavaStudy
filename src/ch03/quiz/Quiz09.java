package ch03.quiz;

import java.util.Scanner;

class Drink{
  String drinkName;
  int sumCnt;
  int payCnt;
}

public class Quiz09 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("음료 메뉴 수량: ");
    int drinkCnt=in.nextInt();
    Drink[] drinks=new Drink[drinkCnt];
    int[] pay=new int[drinkCnt];
    int[] cnt=new int[drinkCnt];

    for(int i=0; i<drinkCnt; i++){
      drinks[i]=new Drink();
      System.out.print("음료 이름 입력: ");
      drinks[i].drinkName=in.next();
    }
    for(int i=0; i<drinkCnt; i++){
      System.out.print(drinks[i].drinkName+"의 요금 입력: ");
      pay[i]=in.nextInt();
    }
    while(true){
      System.out.println("#### 선택 ####");
      System.out.println("1.주문 2.결제 3.총 매출 현황");
      System.out.print("> ");
      int menu=in.nextInt();
      switch(menu){
        case 1:
          System.out.println("#### 메뉴 ####");
          for(int i=0; i<drinkCnt; i++){
            System.out.println((i+1)+". "+drinks[i].drinkName+": "+pay[i]+"원");
          }
            System.out.print("메뉴 선택: ");
            int choice=in.nextInt();
            System.out.print("수량 입력: ");
            cnt[choice-1]=in.nextInt();
            break;
        case 2:
          System.out.println("#### 결제 ####");
          for(int i=0; i<drinkCnt; i++){
            System.out.println((i+1)+". "+drinks[i].drinkName+": "+cnt[i]);
          }
          int sum=0;
          for(int i=0; i<drinkCnt; i++){
            drinks[i].sumCnt+=cnt[i];
            drinks[i].payCnt+=cnt[i]*pay[i];
            sum+=cnt[i]*pay[i];
          }
          System.out.println("총 금액: "+sum);
          System.out.println("결제 완료되었습니다.");
          break;
        case 3:
          System.out.println("#### 매출 현황 ####");
          for(Drink drink:drinks){
            System.out.println("--- "+drink.drinkName+" ---");
            System.out.println("총 판매 금액: "+drink.sumCnt);
            System.out.println("총 판매 수량: "+drink.payCnt);
          }
          break;
        default:
          System.out.println("잘못된 선택입니다.");
      }
    }
  }
}
