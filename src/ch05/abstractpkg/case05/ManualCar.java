package ch05.abstractpkg.case05;

public class ManualCar extends Car{
  public void drive(){
    System.out.println("사람이 운전합니다.");
  }
  public void stop(){
    System.out.println("스스로 멈춥니다.");
  }
}
