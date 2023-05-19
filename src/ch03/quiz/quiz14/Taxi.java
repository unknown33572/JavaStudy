package ch03.quiz.quiz14;

public class Taxi {
  String companyName;
  int income;

  public Taxi(String companyName) {
    this.companyName = companyName;
  }

  public void showTaxiInfo(){
    System.out.printf("%s사의 수입은 %d원 입니다.\n", companyName,income);
  }

  public void take(int money){
    this.income+=money;
  }
}
