package ch03.quiz.quiz14;

public class Main {
  public static void main(String[] args) {
    Worker worker = new Worker("영수", 20000);
    Taxi taxi = new Taxi("KaKao");

    worker.takeTaxi(taxi);

    taxi.showTaxiInfo();
    worker.showWorkerInfo();
  }
}
