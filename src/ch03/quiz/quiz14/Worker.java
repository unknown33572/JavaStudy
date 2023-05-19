package ch03.quiz.quiz14;

import java.util.Scanner;

public class Worker {
  Scanner in=new Scanner(System.in);

  String workerName;
  int money;

  public Worker(String workerName, int money) {
    this.workerName = workerName;
    this.money = money;
  }
  public void takeTaxi(Taxi taxi){
    System.out.print("요금 입력: ");
    int pay=in.nextInt();
    taxi.take(pay);
    this.money-=pay;
  }

  public void showWorkerInfo(){
    System.out.printf("%s님의 잔액은 %d원 입니다.\n", workerName,money);
  }
}
