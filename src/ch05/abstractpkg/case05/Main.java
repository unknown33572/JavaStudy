package ch05.abstractpkg.case05;

public class Main {
  public static void main(String[] args) {
    AutonomousCar autoCar=new AutonomousCar();
    ManualCar manualCar=new ManualCar();
    autoCar.run();
    manualCar.run();
  }
}